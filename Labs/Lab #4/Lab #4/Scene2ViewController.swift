//
//  Scene2ViewController.swift
//  Lab #4
//
//  Created by Dane Fisher on 10/10/18.
//  Copyright © 2018 Dane Fisher. All rights reserved.
//

import UIKit

class Scene2ViewController: UIViewController, UITextFieldDelegate {

    @IBOutlet weak var taskTextField: UITextField!
    @IBOutlet weak var deadlineTextField: UITextField!
    @IBOutlet weak var priorityTextField: UITextField!
    
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        if segue.identifier == "doneTodo"{
            let scene1ViewController = segue.destination as! ViewController
            //check to see that text was entered in the textfields
            if taskTextField.text!.isEmpty == false{
                scene1ViewController.user.task=taskTextField.text
            }
            if deadlineTextField.text!.isEmpty == false{
                scene1ViewController.user.deadline=deadlineTextField.text
            }
            if priorityTextField.text!.isEmpty == false{
                scene1ViewController.user.priority=priorityTextField.text
            }
        }
    }
    
    override func viewDidLoad() {
        taskTextField.delegate=self
        deadlineTextField.delegate=self
        priorityTextField.delegate=self
        super.viewDidLoad()

        // Do any additional setup after loading the view.
    }
    
    func textFieldShouldReturn(_ textField: UITextField) -> Bool {
        textField.resignFirstResponder()
        return true
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    

    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destinationViewController.
        // Pass the selected object to the new view controller.
    }
    */

}
