# ICSE 2019 Artifact Evaluation Getting Started Guide for Swami

This repository contains the source code, data, and results described in the paper titled: 

**Automatically Generating Precise Oracles from Structured Natural Language Specifications**, in Proceedings of the 41st International Conference on Software Engineering (ICSE), 2019
by Manish Motwani and Yuriy Brun.

## How to install Swami

1. Install [Python version 3.5.2](https://www.python.org/downloads/release/python-352/)
2. Install [Standford CoreNLP](https://github.com/Lynten/stanford-corenlp) package using command:`pip install stanfordcorenlp`
3. Clone this repository

## How to run Swami

### Pre-requisites
1. Input specification file in **text** format (ECMA-262_v8.txt). We convert [ECMA-262 V8](http://www.ecma-international.org/publications/files/ECMA-ST-ARCH/ECMA-262%208th%20edition%20June%202017.pdf) pdf file 
   into the text format using [pdfminer](https://github.com/euske/pdfminer) and manually validated (and corrected whereever needed) the convered text. 
   The input specification file is available [here](https://bitbucket.org/manishmotwani/swami/src/master/data/ECMA-262_v8.txt).
2. Source code file implementing Abstract functions. We manually implement some of the abstract functions that are used by the automatically generated test templates. 
   The implemented Abstract functions source code is available [here](https://bitbucket.org/manishmotwani/swami/src/master/data/abstractFunctions.js)
3. [Rhino-1.7.9](https://github.com/mozilla/rhino/releases/tag/Rhino1_7_9_Release) and [Node-10.7.0](https://github.com/nodejs/node/releases/tag/v10.7.0) source code.   

### Input/Output specifications for different modules
Swami allows you to run in three different modes that correspond to following three modules. 

#### Extracting Relevant Sections
* **Description:** This module is used to extract the relevant specification sections (sections which encode testable behavior) from the input specification document.  
* **Input:** Input specification file in **text** format (ECMA-262_v8.txt), path to implemented abstract functions source code, and the path to output directory
* **Output:** Text file listing all the relevant sections describing *ID* (section id), *Summary* (section heading), and *Description* (section body) for each of the extracted sections. 
* **Command to run this module:** `python swami.py ../data/ECMA-262_v8.txt ../data/abstractFunctions.js ../results/ getRelSections node 1000`

#### Generating Test Templates
* **Description:** This module is used to generate *Test Templates* from the specifications that encode the testable behavior. 
As Swami focuses on generating tests for boundary conditions and exceptional behaviour, it generates test templates for the specifications 
that describe either of these system properties.  
* **Input:** Input specification file in **text** format (ECMA-262_v8.txt), path to implemented abstract functions source code, and the path to output directory
This module reuses the file listing relevant sections extracted from input specification if it already exists otherwise runs the above module
to extract relevant sections.  
* **Output:** The JavaScript file (`ecma262_templates.js`) generated inside the output directory. 
* **Command to run this module:** `python swami.py ../data/ECMA-262_v8.txt ../data/abstractFunctions.js ../results/ genTemplates node 1000`

#### Generating Executable Tests
* **Description:** This module is used to generate executable JavaScript test files by instantiating the test templates individually using randomly generated test inputs.  
* **Input:** Input specification file in **text** format (ECMA-262_v8.txt), path to implemented abstract functions source code, path to output directory, and the number of tests to be generated for each template (default=1000).
* **Output:** Test files generated for Rhino are available in: `<path-to-output-directory>/Rhino_ECMA262_Tests`
Test files generated for Node.js are available in: `<path-to-output-directory>/Node_ECMA262_Tests`

* **Command to run this module:** `python swami.py ../data/ECMA-262_v8.txt ../data/abstractFunctions.js ../results/ genTests node 1000`

## How to compare Swami’s outputs to outputs described in the paper.
<TODO>
Explicitly enumerate your claims in both your paper and in your artifact’s documentation.
Provide a VM if possible, and when appropriate.  VMs aid reproducibility because they help control for nuisance factors that are not central to an author’s claims, significantly facilitating the review process.  Nonetheless, reviewers may need to accept performance tradeoffs for VMs (e.g., because of the absence of special hardware).  These tradeoffs are acceptable as long as authors explain to reviewers how and why they should adjust their expectations.
Provide step-by-step instructions, but make it easy for reviewers to supply their own inputs to your artifact.  When reviewers can “play” with your artifact, it gives them confidence that your ideas were implemented robustly.

Rhino's build facilitates measuring code coverage using [Jacoco](https://www.eclemma.org/jacoco/).
We use [Jacoco-Comparison-Tool](https://github.com/mariamr/Jacoco-Comparison-Tool) to compare 
the code coverage ratio of Swami-generated tests with the Developer-written tests and EvoSuite-generated tests. 
