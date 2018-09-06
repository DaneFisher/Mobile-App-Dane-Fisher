//
//  ViewController.swift
//  Chapter 3 in Class
//
//  Created by Dane Fisher on 9/4/18.
//  Copyright © 2018 Dane Fisher. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var album: UIImageView!
    
    @IBAction func changeImage(_ sender: UIButton) {
        album.image=UIImage(named: "glassanimals")
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

