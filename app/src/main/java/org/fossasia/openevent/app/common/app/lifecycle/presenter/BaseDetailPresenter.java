package org.fossasia.openevent.app.common.app.lifecycle.presenter;

import android.support.annotation.CallSuper;

import org.fossasia.openevent.app.common.app.lifecycle.contract.presenter.IDetailPresenter;

public abstract class BaseDetailPresenter<K, V> extends BasePresenter<V> implements IDetailPresenter<K, V> {

    private K id;

    @Override
    @CallSuper
    public void attach(K id, V view) {
        super.attach(view);
        this.id = id;
    }

    protected K getId() {
        return id;
    }

}
