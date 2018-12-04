//
//  FifthViewController.swift
//  Intrigue
//
//  Created by Dane Fisher on 10/15/18.
//  Copyright © 2018 Dane Fisher. All rights reserved.
//

import UIKit

class FifthViewController: UIViewController {

    @IBOutlet weak var btpNumLab: UILabel!
    @IBOutlet weak var btpPointsLab: UILabel!
    
    @IBOutlet weak var btnNumLab: UILabel!
    @IBOutlet weak var btnPointsLab: UILabel!
    
    @IBOutlet weak var bfpNumLab: UILabel!
    @IBOutlet weak var bfpPointsLab: UILabel!
    
    @IBOutlet weak var bfnNumLab: UILabel!
    @IBOutlet weak var bfnPointsLab: UILabel!
    
    @IBOutlet weak var dtpNumLab: UILabel!
    @IBOutlet weak var dtpPointsLab: UILabel!
    
    @IBOutlet weak var dtnNumLab: UILabel!
    @IBOutlet weak var dtnPointsLab: UILabel!
    
    @IBOutlet weak var dfpNumLab: UILabel!
    @IBOutlet weak var dfpPointsLab: UILabel!
    
    @IBOutlet weak var dfnNumLab: UILabel!
    @IBOutlet weak var dfnPointsLab: UILabel!
    
//========================================================
    
    @IBAction func btpAddBut(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total + 2
        
        if let value = Int (btpNumLab.text!) {
            btpNumLab.text = String(describing: value + 1)
            btpPointsLab.text = String(Int(btpNumLab.text!)! * 2)
        }
    }
    
    @IBAction func btpSubButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total - 2 
        
        if let value = Int (btpNumLab.text!) {
            btpNumLab.text = String(describing: value - 1)
            btpPointsLab.text = String(Int(btpNumLab.text!)! * 2)
            
        }
    }
    
//========================================================
    
    @IBAction func btnAddButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total - 1.5
        
        if let value = Double (btnNumLab.text!) {
            btnNumLab.text = String(describing: value + 1)
            btnPointsLab.text = String(Double(btnNumLab.text!)! * (-1.5))
        }
    }
    
    @IBAction func btnSubButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total + 1.5
        
        if let value = Double (btnNumLab.text!) {
            btnNumLab.text = String(describing: value - 1)
            btnPointsLab.text = String(Double(btnNumLab.text!)! * (-1.5))
        }
    }
    
//========================================================
    
    @IBAction func bfpAddButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total + 1.5
        
        if let value = Double (bfpNumLab.text!) {
            bfpNumLab.text = String(describing: value + 1)
            bfpPointsLab.text = String(Double(bfpNumLab.text!)! * (+1.5))
        }
    }

    @IBAction func bfpSubButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total - 1.5
        
        if let value = Double (bfpNumLab.text!) {
            bfpNumLab.text = String(describing: value - 1)
            bfpPointsLab.text = String(Double(bfpNumLab.text!)! * (+1.5))
        }
    }

//========================================================
    
    @IBAction func bfnAddButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total - 1
        
        if let value = Double (bfnNumLab.text!) {
            bfnNumLab.text = String(describing: value + 1)
            bfnPointsLab.text = String(Double(bfnNumLab.text!)! * (-1))
        }
    }
    
    @IBAction func bfnSubButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total + 1
        
        if let value = Double (bfnNumLab.text!) {
            bfnNumLab.text = String(describing: value - 1)
            bfnPointsLab.text = String(Double(bfnNumLab.text!)! * (-1))
        }
    }

//========================================================
    
    @IBAction func dtpAddButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total - 0.5
        
        if let value = Double (dtpNumLab.text!) {
            dtpNumLab.text = String(describing: value + 1)
            dtpPointsLab.text = String(Double(dtpNumLab.text!)! * (-0.5))
        }
    }
    
    @IBAction func dtpSubButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total + 0.5
        
        if let value = Double (dtpNumLab.text!) {
            dtpNumLab.text = String(describing: value - 1)
            dtpPointsLab.text = String(Double(dtpNumLab.text!)! * (-0.5))
        }
    }
    
//========================================================
    
    @IBAction func dtnAddButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total + 1
        
        if let value = Double (dtnNumLab.text!) {
            dtnNumLab.text = String(describing: value + 1)
            dtnPointsLab.text = String(Double(dtnNumLab.text!)! * (1))
        }
    }
    
    @IBAction func dtnSubButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total - 1
        
        if let value = Double (dtnNumLab.text!) {
            dtnNumLab.text = String(describing: value - 1)
            dtnPointsLab.text = String(Double(dtnNumLab.text!)! * (1))
        }
    }
    
//========================================================
    
    @IBAction func dfpAddButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total + 1
        
        if let value = Double (dfpNumLab.text!) {
            dfpNumLab.text = String(describing: value + 1)
            dfpPointsLab.text = String(Double(dfpNumLab.text!)! * (1))
        }
    }
    
    @IBAction func dfpSubButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total - 1
        
        if let value = Double (dfpNumLab.text!) {
            dfpNumLab.text = String(describing: value - 1)
            dfpPointsLab.text = String(Double(dfpNumLab.text!)! * (1))
        }
    }
    
//========================================================
    
    @IBAction func dfnAddButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total + 1
        
        if let value = Double (dfnNumLab.text!) {
            dfnNumLab.text = String(describing: value + 1)
            dfnPointsLab.text = String(Double(dfnNumLab.text!)! * (1))
        }
    }
    
    @IBAction func dfnSubButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total - 1
        
        if let value = Double (dfnNumLab.text!) {
            dfnNumLab.text = String(describing: value - 1)
            dfnPointsLab.text = String(Double(dfnNumLab.text!)! * (1))
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    override func viewDidLoad() {
        super.viewDidLoad()

        // Do any additional setup after loading the view.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
}
