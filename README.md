# Shadow Walker UI Example #

### About ###

Shadow Walker UI is a skin for LibGDX Scene2D.UI on the LWJGL3 backend. This example project implements the skin and showcases new features from the 1.9.9 update:

* Focusable buttons
* Transparent window rendering.

Focusable buttons require some of your own logic to handle key presses. This new technique will allow you to use buttons on devices without mouse/touch input fairly easily.
Transparent window rendering does not work well under Windows 10 on Nvidia cards. This function will remain deprecated until these issues are resolved in LWJGL3. However, this example shows a technique of removing all window decorations and allowing for uniquely shaped or transparent backgrounds.

Branch ControllerMenuStage uses MrStahlfelge's Stage replacement to handle keyboard and controller interaction with Scene2D focusable objects. This dramatically simplifies the code to handle arrow key presses. Instructions to follow for your projects are here: https://github.com/MrStahlfelge/gdx-controllerutils/wiki/Button-operable-Scene2d

### License ###
MIT License

Copyright (c) 2018 Raymond Buckley

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
