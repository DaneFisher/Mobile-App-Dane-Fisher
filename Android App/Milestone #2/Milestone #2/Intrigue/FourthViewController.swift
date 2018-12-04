//
//  FourthViewController.swift
//  Intrigue
//
//  Created by Dane Fisher on 10/15/18.
//  Copyright © 2018 Dane Fisher. All rights reserved.
//

import UIKit

class FourthViewController: UIViewController {

    @IBOutlet weak var btNumLab: UILabel!
    @IBOutlet weak var btPointsLab: UILabel!
    
    @IBOutlet weak var bfNumLab: UILabel!
    @IBOutlet weak var bfPointsLab: UILabel!
    
    @IBOutlet weak var dtNumLab: UILabel!
    @IBOutlet weak var dtPointsLab: UILabel!
    
    @IBOutlet weak var dfNumLab: UILabel!
    @IBOutlet weak var dfPointsLab: UILabel!
    
//========================================================
    
    @IBAction func btAddButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total + 1
        
        if let value = Int (btNumLab.text!) {
            btNumLab.text = String(describing: value + 1)
            btPointsLab.text = String(Int(btNumLab.text!)! * 1)
        }
    }
    
    @IBAction func btSubButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total - 1
        
        if let value = Int (btNumLab.text!) {
            btNumLab.text = String(describing: value - 1)
            btPointsLab.text = String(Int(btNumLab.text!)! * 1)
        }
    }

//========================================================
    
    @IBAction func bfAddButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total + 2
        
        if let value = Double (bfNumLab.text!) {
            bfNumLab.text = String(describing: value + 1)
            bfPointsLab.text = String(Double(bfNumLab.text!)! * 2)
        }
    }
    
    @IBAction func bfSubButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total - 2
        
        if let value = Double (bfNumLab.text!) {
            bfNumLab.text = String(describing: value - 1)
            bfPointsLab.text = String(Double(bfNumLab.text!)! * 2)
        }
    }
    
//========================================================
    
    @IBAction func dtAddButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total - 0.5
        
        if let value = Double (dtNumLab.text!) {
            dtNumLab.text = String(describing: value + 1)
            dtPointsLab.text = String(Double(dtNumLab.text!)! * (-0.5))
        }
    }
    
    @IBAction func dtSubButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total + 0.5
        
        if let value = Double (dtNumLab.text!) {
            dtNumLab.text = String(describing: value - 1)
            dtPointsLab.text = String(Double(dtNumLab.text!)! * (-0.5))
        }
    }
    
//========================================================
    
    @IBAction func dfAddButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total - 1
        
        if let value = Double (dfNumLab.text!) {
            dfNumLab.text = String(describing: value + 1)
            dfPointsLab.text = String(Double(dfNumLab.text!)! * (-1))
        }
    }
    
    @IBAction func dfSubbButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total + 1
        
        if let value = Double (dfNumLab.text!) {
            dfNumLab.text = String(describing: value - 1)
            dfPointsLab.text = String(Double(dfNumLab.text!)! * (-1))
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
