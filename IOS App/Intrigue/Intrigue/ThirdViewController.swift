//
//  ThirdViewController.swift
//  Intrigue
//
//  Created by Dane Fisher on 10/15/18.
//  Copyright © 2018 Dane Fisher. All rights reserved.
//

import UIKit

class ThirdViewController: UIViewController {

    @IBOutlet weak var bNumLab: UILabel!
    @IBOutlet weak var bPointsLab: UILabel!
    
    @IBOutlet weak var dNumLab: UILabel!
    @IBOutlet weak var dPointsLab: UILabel!
    
//========================================================

    @IBAction func bAddButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total + 1
        
        if let value = Int (bNumLab.text!) {
            bNumLab.text = String(describing: value + 1)
            bPointsLab.text = String(Double(bNumLab.text!)! * 1)
        }
    }
    
    @IBAction func bSubButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total - 1
        
        if let value = Int (bNumLab.text!) {
            bNumLab.text = String(describing: value - 1)
            bPointsLab.text = String(Double(bNumLab.text!)! * 1)
        }
    }
    
//========================================================

    @IBAction func dAddButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total - 0.5
        
        if let value = Int (dNumLab.text!) {
            dNumLab.text = String(describing: value + 1)
            dPointsLab.text = String(Double(dNumLab.text!)! * (-0.5))
        }
    }
    
    @IBAction func dSubButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total + 0.5
        
        if let value = Int (dNumLab.text!) {
            dNumLab.text = String(describing: value - 1)
            dPointsLab.text = String(Double(dNumLab.text!)! * (-0.5))
        }
    }
    
//========================================================

    override func viewDidLoad() {
        super.viewDidLoad()

        // Do any additional setup after loading the view.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

}
