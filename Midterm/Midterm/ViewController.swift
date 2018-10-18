//
//  ViewController.swift
//  Midterm
//
//  Created by Dane Fisher on 10/18/18.
//  Copyright © 2018 Dane Fisher. All rights reserved.
//

import UIKit

class ViewController: UIViewController, UITextFieldDelegate {

    @IBOutlet weak var workoutTextField: UITextField!
    @IBOutlet weak var caloriesLabel: UILabel!
    @IBOutlet weak var milesLabel: UILabel!
    @IBOutlet weak var weeklySwitch: UISwitch!
    @IBOutlet weak var activitySegControl: UISegmentedControl!
    @IBOutlet weak var activityImage: UIImageView!
    
    func textFieldShouldReturn(_ textField: UITextField) -> Bool {
        textField.resignFirstResponder()
        return true
    }
    
    func sendCalculate() {
        
        var workoutTime:Float
        var milesTraveled:Float
        var caloriesBurned:Float
        
        if workoutTextField.text!.isEmpty {
            workoutTime = 0
        }
        else {
            workoutTime = Float(workoutTextField.text!)!
        }
        
        if workoutTime < 30 {
            //create a UIAlertController object
            let alert=UIAlertController(title: "Warning", message: "Must work out more than 30mins, YOU SLOTH", preferredStyle: UIAlertControllerStyle.alert)
            //create a UIAlertAction object for the button
            let cancelAction=UIAlertAction(title: "Cancel", style:UIAlertActionStyle.cancel, handler: nil)
            alert.addAction(cancelAction) //adds the alert action to the alert object
            let okAction=UIAlertAction(title: "OK", style: UIAlertActionStyle.default, handler: {action in
                self.workoutTextField.text="30"
//              calculate()
            })
            alert.addAction(okAction)
            present(alert, animated: true, completion: nil)
        }
        else {
            calculate()
        }
    }
    
    func calculate () {
        var workoutTime:Float
        var milesTraveled:Float
        var caloriesBurned:Float
        
        if workoutTextField.text!.isEmpty {
            workoutTime = 0
        }
        else {
            workoutTime = Float(workoutTextField.text!)!
        }
        
        if activitySegControl.selectedSegmentIndex == 0 {
            if weeklySwitch.isOn {
                milesTraveled = (workoutTime / 10) * 5
                caloriesBurned = (workoutTime * 10) * 5
            }
            else {
                milesTraveled = workoutTime / 10
                caloriesBurned = workoutTime * 10
            }
        }
        else if activitySegControl.selectedSegmentIndex == 1 {
            if weeklySwitch.isOn {
                milesTraveled = (workoutTime / 30) * 5
                caloriesBurned = (workoutTime * 8.5) * 5
            }
            else {
                milesTraveled = workoutTime / 30
                caloriesBurned = workoutTime * 8.5
            }
        }
            
        else {
            if weeklySwitch.isOn {
                milesTraveled = (workoutTime / 4) * 5
                caloriesBurned = (workoutTime * 7) * 5
            }
            else {
                milesTraveled = workoutTime / 4
                caloriesBurned = workoutTime * 7
            }
        }
        
        let currencyFormatter = NumberFormatter()
        currencyFormatter.numberStyle=NumberFormatter.Style.currency
        
        milesLabel.text=currencyFormatter.string(from: NSNumber(value: milesTraveled)) //returns a formatted string
        
        milesLabel.text=NSString(format: "%.2f", milesTraveled) as String + " miles"
        
        caloriesLabel.text=currencyFormatter.string(from: NSNumber(value: caloriesBurned)) //returns a formatted string
        
        caloriesLabel.text=NSString(format: "%.2f", caloriesBurned) as String + " calories burned"
    }

    @IBAction func updateImage(_ sender: UISegmentedControl) {
            if activitySegControl.selectedSegmentIndex == 0 {
                activityImage.image = UIImage(named: "run")
            }
            if activitySegControl.selectedSegmentIndex == 1 {
                activityImage.image = UIImage(named: "swim")
            }
            if activitySegControl.selectedSegmentIndex == 2 {
                activityImage.image = UIImage(named: "bike")
            }
    }
    
    @IBAction func workoutButton(_ sender: UIButton) {
        sendCalculate ()
    }
    
    override func viewDidLoad() {
        workoutTextField.delegate = self
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
}

