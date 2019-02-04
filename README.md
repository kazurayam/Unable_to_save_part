"Unable to save part" error on changing Default value of Variables for Test Case
==================

## What is this?

This is a small Katalon Studio project in order to let you reproduce a problem of Katalon Studio. You can get the zip from [Releases] page.
 Download the zip, unzip it, open it with your Katalon Studio.

 This project was developed using Katalon Studio version 5.10.1 on Windows 7.

## How to reproduce the problem

1. open the project with your Katalon Studio
2. open the test case named `Test Cases/main/restorePreviousTSuiteResult`
3. click the `Variables` tab.
4. you will find a variable named `STRATEGY` is predefined. It has type of String. It has the default value of `1hourAgo`.

![1_initial_state.png](docs/images/1_initial_state.png)

### Problem 1 : changed the default value, but the new value is not displayed

I wanted to change the default value of the `STRATEGY` variable from `1hourAgo` to a new value `last`.

In the Variables tab, at the row of `STRATEGY`, in the input field of Default value , I typed in the new value `last`. See the screenshot:

![2_typed_new_default_value.png](docs/images/2_typed_new_default_value.png)

Then I moved the cursor out of the input field. I expected that the new value `last` to be displayed in the field, of course. Howerver, to my biggest surprise, **the input field displayed the old value `1hourAgo`**.

![3_new_default_value_is_not_show_up](docs/images/3_new_default_value_is_not_show_up.png)

I thought I need to retype the new value, so I moved the cursor in to the input field of Default value, `last` came up! The input field knew the new value `last` but does not show it up. Why? I do not find any rational explanation for this behavior.

### Problem 2 : `Unable to save part` when tried to save the change

I thought the new value `last` is accepted (though it is not shown up). So I wanted to save the settings into disk. I clicked the Save All button. Then a Error dialog came. **It said "Unable to save part".**

![4_clicked_save_button_unable_to_save_part.png](docs/images/4_clicked_save_button_unable_to_save_part.png)

I was unable to save the change at all.
