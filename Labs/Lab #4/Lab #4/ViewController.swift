//
//  ViewController.swift
//  Lab #4
//
//  Created by Dane Fisher on 10/10/18.
//  Copyright © 2018 Dane Fisher. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    
    @IBOutlet weak var taskLabel: UILabel!
    @IBOutlet weak var deadlineLabel: UILabel!
    @IBOutlet weak var priorityLabel: UILabel!
    
    var user=Todo()
    
    let filename = "todos.plist"
    
    @IBAction func unwindSegue(_ segue:UIStoryboardSegue){
        taskLabel.text=user.task
        deadlineLabel.text=user.deadline
        priorityLabel.text=user.priority
    }

    func dataFileURL(_ filename:String) -> URL? {
        //returns an array of URLs for the document directory in the user's home directory
        let urls = FileManager.default.urls(for:.documentDirectory, in: .userDomainMask)
        var url : URL?
        //append the file name to the first item in the array which is the document directory
        url = urls.first?.appendingPathComponent(filename)
        //return the URL of the data file or nil if it does not exist
        return url
    }
    
    override func viewDidLoad() {
        //url of data file
        let fileURL = dataFileURL(filename)
        
        //if the data file exists, use it
        if FileManager.default.fileExists(atPath: (fileURL?.path)!){
            let url = fileURL!
            do {
                //creates a data buffer with the contents of the plist
                let data = try Data(contentsOf: url)
                //create an instance of PropertyListDecoder
                let decoder = PropertyListDecoder()
                //decode the data using the structure of the Favorite class
                user = try decoder.decode(Todo.self, from: data)
                //assign data to textfields
                taskLabel.text=user.task
                deadlineLabel.text=user.deadline
                priorityLabel.text=user.priority
            } catch {
                print("no file")
            }
            
            /*pre swift 4
             //uses String instead or URL
             //load the data of the plist file into a dictionary
             let dataDictionary = NSDictionary(contentsOfFile: path!) as! [String:String]
             //load favorite book
             if dataDictionary.keys.contains("favBook") {
             user.favBook = dataDictionary["favBook"]
             bookLabel.text=user.favBook
             }
             //load favorite author
             if dataDictionary.keys.contains("favAuthor") {
             user.favAuthor = dataDictionary["favAuthor"]
             authorLabel.text=user.favAuthor
             }
             */
            
        }
        else {
            print("file does not exist")
        }
        //application instance
        let app = UIApplication.shared
        //subscribe to the UIApplicationWillResignActiveNotification notification
        NotificationCenter.default.addObserver(self, selector: #selector(self.applicationWillResignActive(_:)), name: Notification.Name.UIApplicationWillResignActive, object: app)
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    @objc func applicationWillResignActive(_ notification: Notification){
        //url of data file
        let fileURL = dataFileURL(filename)
        //create an instance of PropertyListEncoder
        let encoder = PropertyListEncoder()
        //set format type to xml
        encoder.outputFormat = .xml
        do {
            //encode the data using the structure of the Favorite class
            let plistData = try encoder.encode(user)
            //write encoded data to the file
            try plistData.write(to: fileURL!)
        } catch {
            print("write error")
        }
        
        /* pre swift 4
         let data = NSMutableDictionary()
         //adds
         if user.favBook != nil{
         data.setValue(user.favBook, forKey: "favBook")
         
         }
         if user.favAuthor != nil{
         data.setValue(user.favAuthor, forKey: "favAuthor")
         }
         //write the contents of the array to our plist file
         //data.write(toFile: filePath!, atomically: true)
         
         */
        
    }
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

