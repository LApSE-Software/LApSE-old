# LApSE
The Protocol Annotation System (LApSE) is a software to tag or label several parts of a drawing and provide analysis on how the drawing is constructed. The drawing file is generated from TRACE software by Dr. Peter Cheng.

### Binary download
[lapse-0.1.1-alpha-setup.exe](https://github.com/LApSE-Software/LApSE-old/releases/download/0.1.1-alpha/lapse-0.1.1-alpha-setup.exe)

### Building from source
LApSE uses Log4J 2 for its logging system. Therefore, you need to download Log4J 2 binary from [here](http://logging.apache.org/log4j/2.x/download.html), and then add the dependencies listed below to the project:
- log4j-api-2.3.jar
- log4j-core-2.3.jar

### File format
The bare minimum of the file consists of an indicator ```<<Extracted_Lines>>``` followed by the line coordinates. The format for the line coordinates are as follows:
```
<ID>,<X_START>,<X_END>,<Y_START>,<Y_END>,<TIME_START>,<TIME_END>,<TAG>
```
- ID - line ID number.
- X_START - x-value of starting coordinate of the line
- X_END - x-value of ending coordinate of the line
- Y_START - y-value of starting coordinate of the line
- Y_END - y-value of ending coordinate of the line
- TIME_START - the time when the line started to be drawn
- TIME_END - the time when the line ends
- TAG - (Optional) the tag or label for the line generated by LApSE

Example:
```
<<Extracted_Lines>>
1,1861,1833,68,143,0,266,Hash
2,1878,1854,71,149,625,860,Hash
3,1914,1907,91,93,1360,1469,Hash
4,1883,1889,129,130,1907,2125,Hash
5,349,468,293,295,5344,5891,AppleTree
```

### License
```
The MIT License (MIT)

Copyright (c) 2015 Burhanuddin Baharuddin

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
```
