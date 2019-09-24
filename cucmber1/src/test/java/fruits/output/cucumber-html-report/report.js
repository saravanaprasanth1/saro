$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:fruits/fruits.feature");
formatter.feature({
  "name": "Eating fruits",
  "description": "This feature explains about fruits",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Eating",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "There are \"\u003cStart\u003e\" fruits",
  "keyword": "Given ",
  "rows": [
    {
      "cells": [
        "type",
        "with"
      ]
    },
    {
      "cells": [
        "apples",
        "me"
      ]
    },
    {
      "cells": [
        "oranges",
        "mary"
      ]
    },
    {
      "cells": [
        "cucumbers",
        "john"
      ]
    }
  ]
});
formatter.step({
  "name": "I eat \"\u003ceat\u003e\" fruits",
  "keyword": "When "
});
formatter.step({
  "name": "I have \"\u003cleft\u003e\" fruits",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Start",
        "eat",
        "left"
      ]
    },
    {
      "cells": [
        "12",
        "5",
        "7"
      ]
    },
    {
      "cells": [
        "10",
        "4",
        "6"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Eating",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "There are \"12\" fruits",
  "rows": [
    {
      "cells": [
        "type",
        "with"
      ]
    },
    {
      "cells": [
        "apples",
        "me"
      ]
    },
    {
      "cells": [
        "oranges",
        "mary"
      ]
    },
    {
      "cells": [
        "cucumbers",
        "john"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "stepfruits.Therearefruits(String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I eat \"5\" fruits",
  "keyword": "When "
});
formatter.match({
  "location": "stepfruits.main1(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have \"7\" fruits",
  "keyword": "Then "
});
formatter.match({
  "location": "stepfruits.main(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Eating",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "There are \"10\" fruits",
  "rows": [
    {
      "cells": [
        "type",
        "with"
      ]
    },
    {
      "cells": [
        "apples",
        "me"
      ]
    },
    {
      "cells": [
        "oranges",
        "mary"
      ]
    },
    {
      "cells": [
        "cucumbers",
        "john"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "stepfruits.Therearefruits(String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I eat \"4\" fruits",
  "keyword": "When "
});
formatter.match({
  "location": "stepfruits.main1(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have \"6\" fruits",
  "keyword": "Then "
});
formatter.match({
  "location": "stepfruits.main(String)"
});
formatter.result({
  "status": "passed"
});
});