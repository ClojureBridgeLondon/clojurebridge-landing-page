# clojurebridge-london-landing-page


Project created with the [figwheel-main template](https://github.com/bhauman/figwheel-main-template) for Leiningen and Clojure CLI tools.

```shell
lein new figwheel-main clojurebridge-london-landing-page -- --reagent
```


Examples to help you build a new website for ClojureBridge London using ClojureScript and a React.js style library called reagent.

## Suggested features

We would love to see what sort of ideas you create for our website.

To help you get started, some things you could include in a new website could include:

* Sign up section (register interest when there is no current event)
* Aim of ClojureBridge London
* History of Women in Tech
* Why learn Clojure?
* Clojure showcase (demos, videos, etc to show off Clojure diversity)
* Coaching guide
* Clojure on your Computer (do you need it yet?, how to install it)

Some additional thoughts
* Describe the experience as a student - even experiences, testimonials, student showcase
* Describe the experience as a coach - add to coaching guide
* Where next guide
* Register for the event using the BridgeTroll API
* Show who is attending via the BridgeTroll API



FIXME: Write a one-line description of your library/project.

## Overview

FIXME: Write a paragraph about the library/project and highlight its goals.

## Development

To get an interactive development environment run:

    lein fig:build

This will auto compile and send all changes to the browser without the
need to reload. After the compilation process is complete, you will
get a Browser Connected REPL. An easy way to try it is:

    (js/alert "Am I connected?")

and you should see an alert in the browser window.

To clean all compiled files:

    lein clean

To create a production build run:

    lein clean
    lein fig:min


## License

Copyright © 2018 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
