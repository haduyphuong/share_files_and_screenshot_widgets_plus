package com.twwm.share_files_and_screenshot_widgets;

import androidx.core.content.FileProvider;

/**
 * Providing a custom {@code FileProvider} prevents manifest {@code <provider>} name collisions.
 *
 * <p>See https://developer.android.com/guide/topics/manifest/provider-element.html for details.
 */
public class ShareFilesAndScreenshotWidgetsFileProvider extends FileProvider {
}