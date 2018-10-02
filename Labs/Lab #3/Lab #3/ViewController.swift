//
//  ViewController.swift
//  Lab #3
//
//  Created by Dane Fisher on 10/1/18.
//  Copyright © 2018 Dane Fisher. All rights reserved.
//

import UIKit

class ViewController: UIViewController, UITextFieldDelegate {

    @IBOutlet weak var heightField: UITextField!
    @IBOutlet weak var radiusField: UITextField!
    @IBOutlet weak var volumeLabel: UILabel!
    
    func textFieldShouldReturn(_ textField: UITextField) -> Bool {
        textField.resignFirstResponder()
        return true
    }
    
    func update() {
        var height:Float //check amount
        var radius:Float //tip percentage
        
        if heightField.text!.isEmpty {
            height = 0
        } else {
            height = Float(heightField.text!)!
        }
        if radiusField.text!.isEmpty {
            radius = 0
        }
        else {
            radius = Float(radiusField.text!)!
        }
        
        let volume=3.141592*(radius*radius)*height
        
        if height <= 0 {
            //create a UIAlertController object
            let alert=UIAlertController(title: "Warning", message: "The height must be greater than 0", preferredStyle: UIAlertControllerStyle.alert)
            //create a UIAlertAction object for the button
            let cancelAction=UIAlertAction(title: "Cancel", style:UIAlertActionStyle.cancel, handler: nil)
            alert.addAction(cancelAction) //adds the alert action to the alert object
            let okAction=UIAlertAction(title: "OK", style: UIAlertActionStyle.default, handler: {action in
                self.heightField.text="1"
                self.update()
            })
            alert.addAction(okAction)
            present(alert, animated: true, completion: nil)
        }
        
        if radius <= 0 {
            //create a UIAlertController object
            let alert=UIAlertController(title: "Warning", message: "The radius must be greater than 0", preferredStyle: UIAlertControllerStyle.alert)
            //create a UIAlertAction object for the button
            let cancelAction=UIAlertAction(title: "Cancel", style:UIAlertActionStyle.cancel, handler: nil)
            alert.addAction(cancelAction) //adds the alert action to the alert object
            let okAction=UIAlertAction(title: "OK", style: UIAlertActionStyle.default, handler: {action in
                self.radiusField.text="1"
                self.update()
            })
            alert.addAction(okAction)
            present(alert, animated: true, completion: nil)
        }
        
        let currencyFormatter = NumberFormatter()
        currencyFormatter.numberStyle=NumberFormatter.Style.currency
        
        volumeLabel.text=currencyFormatter.string(from: NSNumber(value: volume)) //returns a formatted string
        
        volumeLabel.text=NSString(format: "%.2f", volume) as String
    }
    
    func textFieldDidEndEditing(_ textField: UITextField) {
        update()
    }
    
    override func viewDidLoad() {
        heightField.delegate=self
        radiusField.delegate=self
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    @IBAction func onTapGestureRecognized(_ sender: AnyObject) {
        heightField.resignFirstResponder()
        radiusField.resignFirstResponder()
    }
    
}

