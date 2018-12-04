//
//  SecondViewController.swift
//  Intrigue
//
//  Created by Dane Fisher on 10/11/18.
//  Copyright © 2018 Dane Fisher. All rights reserved.
//

import UIKit

class SecondViewController: UIViewController {
    
    @IBOutlet weak var cNumLab: UILabel!
    @IBOutlet weak var cPointsLab: UILabel!
    
    @IBOutlet weak var iNumLab: UILabel!
    @IBOutlet weak var iPointsLab: UILabel!
    
//========================================================
    
    @IBAction func cAddButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total + 0.5
        
        if let value = Int (cNumLab.text!) {
            cNumLab.text = String(describing: value + 1)
            cPointsLab.text = String(Double(cNumLab.text!)! * 0.5)
        }
    }
    
    @IBAction func cSubButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total - 0.5
        
        if let value = Int (cNumLab.text!) {
            cNumLab.text = String(describing: value - 1)
            cPointsLab.text = String(Double(cNumLab.text!)! * 0.5)
        }
    }
    
//========================================================
    
    @IBAction func iAddButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total - 0.5
        
        if let value = Int (iNumLab.text!) {
            iNumLab.text = String(describing: value + 1)
            iPointsLab.text = String(Double(iNumLab.text!)! * (-0.5))
        }
    }
    
    @IBAction func iSubButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total + 0.5
        
        if let value = Int (iNumLab.text!) {
            iNumLab.text = String(describing: value - 1)
            iPointsLab.text = String(Double(iNumLab.text!)! * (-0.5))
        }
    }

//========================================================
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

//    override func viewWillAppear(_ animated: Bool) {
//        subLabel.text = String(describing: 0)
//    }
    
//    override func viewWillDisappear(_ animated: Bool) {
//        let tabbar = tabBarController as! BaseTabBarController
//        tabbar.total = Double(subLabel.text!)!
//    }
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

