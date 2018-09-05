package de.codebucket.mkkm.webview;

import android.content.Context;
import android.util.Log;
import android.webkit.JavascriptInterface;

public class LocalStorageAdapter {

    private Context mContext;

    public LocalStorageAdapter(Context context) {
        mContext = context;
    }

    /**
     * This method allows to get an item for the given key
     * @param key: the key to look for in the local storage
     * @return the item having the given key
     */
    @JavascriptInterface
    public String getItem(String key) {
        Log.e("LocalStorageAdapterDEBUG", "access for: " + key);
        return "emptyness";
    }

    /**
     * set the value for the given key, or create the set of datas if the key does not exist already.
     * @param key
     * @param value
     */
    @JavascriptInterface
    public void setItem(String key, String value) {
        Log.e("LocalStorageAdapterDEBUG", "write for: " + key + ", v: " + value);
    }

    /**
     * removes the item corresponding to the given key
     * @param key
     */
    @JavascriptInterface
    public void removeItem(String key) {

    }

    /**
     * clears all the local storage.
     */
    @JavascriptInterface
    public void clear() {

    }
}
