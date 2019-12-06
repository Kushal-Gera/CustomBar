CustomBar
==========
---


## *Bored of Your OLD Snackbar!! You got to the right place*


**Key Features of CustomBar**
---

* #### Set Custom Backgrounds drawables
* #### Change Background Colors
* #### Set Margins
* #### Change Text Color, and Text Size
* #### Add ActionView Color and Text Size
---



### Usage Example


```

CustomBar(your_view, "Removed Successfully", Snackbar.LENGTH_SHORT).run {

   //Set custom background Resources from here
            this.setBackground(R.drawable.round_corners)

   //Want to set all margin at once
            this.setMargins(15)

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
	        implementation 'com.github.Kushal-Gera:CustomBar:1.0.2'
	}
```



