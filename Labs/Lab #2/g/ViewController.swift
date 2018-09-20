//
//  ViewController.swift
//  g
//
//  Created by Dane Fisher on 9/19/18.
//  Copyright © 2018 Dane Fisher. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var bandName: UILabel!
    @IBOutlet weak var albumCover: UIImageView!
    @IBOutlet weak var imageControl: UISegmentedControl!
    @IBOutlet weak var capitalSwitch: UISwitch!
    @IBOutlet weak var fontSizeLabel: UILabel!
    @IBOutlet weak var text: UITextView!
    @IBOutlet weak var colorControl: UISegmentedControl!
    
    func updateImage() {
        if imageControl.selectedSegmentIndex == 0 {
            bandName.text="Alt-J"
            albumCover.image=UIImage(named: "alt")
            text.text = "Alt-J (stylised as alt-J, or ∆) is an English indie rock band formed in 2007 in Leeds, by Joe Newman (guitar/lead vocals), Thom Sonny Green (drums), Gusset Unger-Hamilton (keyboards/vocals) and Gwil Sainsbury (guitar/bass)."
        }
        else if imageControl.selectedSegmentIndex == 1 {
            bandName.text="Glass Animals"
            albumCover.image=UIImage(named: "glass")
            text.text = "Glass Animals are an English indie rock band from Oxford consisting of members Dave Bayley (lead vocals, guitar), Drew MacFarlane (guitar, keys, backing vocals), Edmund Irwin-Singer (bass, keys, backing vocals), and Joe Seaward (drums)."
        }
    }
    
    func updateCaps() {
        if capitalSwitch.isOn {
            bandName.text=bandName.text?.uppercased()
        }
        else {
            bandName.text=bandName.text?.lowercased()
        }
    }
    
    func updateColor() {
        if colorControl.selectedSegmentIndex == 0 {
            bandName.textColor = UIColor.white
        }
        else if colorControl.selectedSegmentIndex == 1 {
            bandName.textColor = UIColor.magenta
        }
    }
    
    @IBAction func updateBand(_ sender: UISegmentedControl) {
        updateImage()
        updateCaps()
        updateColor()
    }
    
    @IBAction func updateCaps(_ sender: UISwitch) {
        updateCaps()
    }
    
    @IBAction func updateSize(_ sender: UISlider) {
        let fontSize=sender.value
        fontSizeLabel.text=String(format: "%.0f", fontSize)
        let fontSizeCGFloat=CGFloat(fontSize)
        bandName.font=UIFont.systemFont(ofSize: fontSizeCGFloat)
    }
    
    @IBAction func callColor(_ sender: UISegmentedControl) {
        updateColor()
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

