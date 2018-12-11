# Android Hello World

Just an extended Hello World example pure Android app that:

- [ ] Released on Play Store
- [ ] Has unit test
- [ ] Has integration test
- [ ] Auto test on CI
- [ ] Auto publish to Play Store

I make this to learn about Android release process and apply some best practice
in Software Engineering to this field.

I never know that in order to releasing an app we have to gone through so many
hassle that absolutely not beginner friendly. If you are a seasoned Android
developer, there's nothing here for you. This may be helpful for someone who
just finished some tutorials and want to learn the next steps. Also helpful for
anyone who get lost in ton of Google document pages.

App is generated using Android Studio, with slightly modification, nothing
interesting. The following content mainly about how to relase and setup CI/CD
for the app. Of course, it's unlikely that you will understand the **why**
behind all following commands, configs. This can help you get your hand dirty,
but nothing can replace proper study. So, after having fun, please take your
time read the linked documents.

## Note

As the writing time, I'm using:

- Android Studio 3.2.1

## Sign the app

- Debug build is auto signed via using `app/debug.keystore`.
- Release key: on Android Studio, use **Build > Build > Generate Signed
  Bundle/APK**. Follow [this](https://developer.android.com/studio/publish/app-signing#generate-key)
  - Beware that if you don't specify full path for the release key locations, it
    might be generated inside your Android Studion `/bin` folder. You can try to
    open the form "Generate Signed Bundle/APK" and click "Choose existing..."
    and, hopefully, it will show you the folder of your newly generated key.
  - I'm using Google Play App Signing since I don't trust myself to manage
    the release key. You may have other opinion given that [Google has the power
    to compromise your app](https://stackoverflow.com/a/44647037/3869533)

## Prepare app infomation on Google Play

- Go to https://play.google.com/apps/publish (register and pay the fee if you
  haven't)

- Fill in the information in the "Store Listing" menu. Be sure to fill all the
  fields marked with `*`.

  - For the privacy policy, given that this app is open source, and I collect
    absolutely nothing, I use a [generator](https://app-privacy-policy-generator.firebaseapp.com/)
    and distribute it via Github using a permanent link.

  - Besure to take and upload 2 screenshots. You can [use
    Logcat](https://developer.android.com/studio/debug/am-screenshot) to capture
    device screen.

  - For hi-res app icons, I use [Android Asset
    Studio](https://romannurik.github.io/AndroidAssetStudio/index.html). The
    generated zip come with an hi-res image that we can use for this process.

  - For featured image, use this
    [tool(https://www.norio.be/android-feature-graphic-generator/)

- Fill the Pricing and Distribution doc.
- Go to the release and start rollout. This may need a few minutes before we can
  search for the app on Play Store.

## License

MIT
