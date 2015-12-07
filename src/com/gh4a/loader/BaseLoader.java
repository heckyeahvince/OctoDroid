package com.gh4a.loader;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;

import com.gh4a.Constants;

public abstract class BaseLoader<T> extends AsyncTaskLoader<LoaderResult<T>> {
    private T mPrefilledData;

    public BaseLoader(Context context) {
        super(context);
        onContentChanged();
    }

    public void prefillData(T data) {
        if (!isStarted()) {
            mPrefilledData = data;
        }
    }

    @Override
    public LoaderResult<T> loadInBackground() {
        try {
            T data = doLoadInBackground();
            return new LoaderResult<>(data);
        } catch (Exception e) {
            Log.e(Constants.LOG_TAG, e.getMessage(), e);
            return new LoaderResult<>(e);
        }
    }

    @Override
    protected void onStartLoading() {
        if (takeContentChanged()) {
            if (mPrefilledData == null) {
                forceLoad();
            } else {
                LoaderResult<T> result = new LoaderResult<>(mPrefilledData);
                deliverResult(result);
                mPrefilledData = null;
            }
        }
    }

    @Override
    protected void onStopLoading() {
        cancelLoad();
    }

    protected abstract T doLoadInBackground() throws Exception;
}
