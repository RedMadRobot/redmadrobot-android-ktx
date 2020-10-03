#!/usr/bin/env bash

set -e

# Gradle
cp ../gradle.properties .
cp ../gradlew.* .
cp -r ../gradle .

# Static analyzers + Codestyle
cp ../../.editorconfig .
cp -r ../../config/detekt ./config/