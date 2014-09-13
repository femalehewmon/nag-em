build:
	android update project --name "Nag'em" --target "android-20" --path .
	ant debug

install: build
	adb install "./bin/Nag'em-debug.apk"

clean:
	rm -rf bin gen
