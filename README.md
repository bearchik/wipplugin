# Plugin wipplugin for Atlassian Bitbucket Server
The plugin allows you use WIP status in pull request.
Plugin uses last Atlasian SDK atlassian-plugin-sdk-8.0.16 and has not problem with compatible in Atlassian Bitbucket Server v6.3.2

I get idea and some code from: https://github.com/leominov/bitbucket-wip-plugin/

## Compile
1. Download and install Java JDK 1.8 from Oracle site: https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
2. Download and install Atlassian SDK from Atlassian site: https://developer.atlassian.com/server/framework/atlassian-sdk/downloads/
3. Clone git rep to local computer: **git clone https://github.com/bearchik/wipplugin.git**
4. Run **atlas-run** in folder with repo.
Your plugin in **../target/wipplugin-1.0.0-SNAPSHOT.jar**

## Install
1. Login to Atlassian Bitbucket with **Administrator** permission.
2. Click to **Manage apps** in administration section on left panel.
3. Click to **Upload app** on top.
4. Choose file **../target/wipplugin-1.0.0-SNAPSHOT.jar**
5. Click to **Upload** button.

## Usage
1. Open Your repo
2. Click **Edit**
3. Click on **Repository settings**.
4. Click on **Merge checks**
5. Switch to "Enabled" status
6. Enjoy

## Credentials
Author: **bearchik@gmail.com**

## License

MIT License

Copyright (c) 2019 bearchik@gmail.com

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
