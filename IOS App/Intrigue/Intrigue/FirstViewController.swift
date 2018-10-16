//
//  FirstViewController.swift
//  Intrigue
//
//  Created by Dane Fisher on 10/11/18.
//  Copyright © 2018 Dane Fisher. All rights reserved.
//

import UIKit

class FirstViewController: UIViewController {

    @IBOutlet weak var totalLabel: UILabel!
    @IBOutlet weak var statusLabel: UILabel!
    
    @IBOutlet weak var aNumLab: UILabel!
    @IBOutlet weak var aPointsLab: UILabel!
    
    @IBOutlet weak var baNumLab: UILabel!
    @IBOutlet weak var baPointsLab: UILabel!
    
//========================================================
    
    @IBAction func aAddButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total + 1
        
        if let value = Int (aNumLab.text!) {
            aNumLab.text = String(describing: value + 1)
            aPointsLab.text = String(Double(aNumLab.text!)! * 1)
        }
        
        totalLabel.text = String(describing: tabbar.total)
    }
    
    @IBAction func aSubButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total - 1
        
        if let value = Int (aNumLab.text!) {
            aNumLab.text = String(describing: value - 1)
            aPointsLab.text = String(Double(aNumLab.text!)! * 1)
        }
        
        totalLabel.text = String(describing: tabbar.total)
    }
    
//========================================================
    
    @IBAction func baAddButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total - 1.5
        
        if let value = Int (baNumLab.text!) {
            baNumLab.text = String(describing: value + 1)
            baPointsLab.text = String(Double(baNumLab.text!)! * (-1.5))
        }
        
        totalLabel.text = String(describing: tabbar.total)
    }
    
    @IBAction func baSubButt(_ sender: UIButton) {
        let tabbar = tabBarController as! BaseTabBarController
        tabbar.total = tabbar.total + 1.5
        
        if let value = Int (baNumLab.text!) {
            baNumLab.text = String(describing: value - 1)
            baPointsLab.text = String(Double(baNumLab.text!)! * (-1.5))
        }
        
        totalLabel.text = String(describing: tabbar.total)
    }
    
//========================================================
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        let tabbar = tabBarController as! BaseTabBarController
        totalLabel.text = String(describing: tabbar.total)
    }

    override func viewDidAppear(_ animated: Bool) {
        
        let tabbar = tabBarController as! BaseTabBarController
        totalLabel.text = String(describing: tabbar.total)
        
        //Status Stuff
        if (tabbar.total >= 25)
        {
            statusLabel.text = "President"
        }
        else if (tabbar.total < 25 && tabbar.total > 16.5 )
        {
            statusLabel.text = "Cabinet"
        }
        else if (tabbar.total < 17 && tabbar.total > 9.5 )
        {
            statusLabel.text = "Senator"
        }
        else{
            statusLabel.text = "Party Member"
        }
        
    }
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

