CustomBar
==========
---

## *Bored of Your OLD Snackbar!! You got to the right place*

<img src="https://github.com/Kushal-Gera/CustomBar/blob/master/screenshot.png" height="700" width="380">
---

**Key Features of CustomBar**
---

* #### Set Custom Backgrounds drawables
* #### Change Background Colors
* #### Set Margins
* #### Change Text Color, and Text Size
* #### Add ActionView Color and Text Size
* #### Set Custom Icon
---


### Usage Example


```

CustomBar(your_view, "Removed Successfully", Snackbar.LENGTH_SHORT).run {

   //Set custom background Resources from here
            this.setBackground(R.drawable.round_corner_dark_bg)

   //Want to set custom margins, Here is the way to go!
            this.setMargins(15, 0, 15, 30)

   //Optional text size for the the Custom Bar Text
            this.setTextSize(18f)

   //Add ActionText and ActionListener to CustomBar
   //With optional UpperCase/LowerCase boolean
   //With optional TextSize declaration
            this.actionText("Undo", View.OnClickListener {}, false, 16f)

    //Specify Action Color Here! Default == @accentColor
            this.actionTextColor(R.color.colorAccent)


    //Specify Custom Icon 
            this.setIcon(resources.getDrawable(R.drawable.android), null, null, null)

    //Calls the good old Snackbar.show()
            this.show()
        }
```
---



### Implementation


#### Step 1. Add it in your root build.gradle at the end of repositories:


```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

#### Step 2. Add the dependency

```
dependencies {
	        implementation 'com.github.Kushal-Gera:CustomBar:2.0.0'
	}
```

> Note: For projects without kotlin, you may need to add org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion to your dependencies since this is a Kotlin library.

---


### License

MIT License

Copyright (c) 2020 `Kushal Gera`

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.


