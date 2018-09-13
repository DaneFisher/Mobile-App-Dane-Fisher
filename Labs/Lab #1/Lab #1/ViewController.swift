//
//  ViewController.swift
//  Lab #1
//
//  Created by Dane Fisher on 9/11/18.
//  Copyright © 2018 Dane Fisher. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var mountain: UIImageView!
//    @IBOutlet weak var peakdesc: UITextView!
    @IBOutlet weak var classlabel: UILabel!
    @IBOutlet weak var milelabel: UILabel!
    @IBOutlet weak var elevlabel: UILabel!
    @IBOutlet weak var peakname: UILabel!
    
    @IBAction func changepic(_ sender: UIButton) {
        if sender.tag == 1 {
            mountain.image=UIImage(named: "capitol")
            classlabel.text = "Class: 4/5"
            milelabel.text = "Mileage: 17 miles"
            elevlabel.text = "Elevation: 14,130"
            peakname.text = "Capitol"
        }
        else if sender.tag == 2 {
            mountain.image=UIImage(named: "crestone")
            classlabel.text = "Class: 3/5"
            milelabel.text = "Mileage: 12 miles"
            elevlabel.text = "Elevation: 14,197"
            peakname.text = "Crestone"
        }
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

