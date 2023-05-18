#!/usr/bin/env bash
mvn package fabric8:build fabric8:push -X -Dfabric8.logDeprecationWarning=false