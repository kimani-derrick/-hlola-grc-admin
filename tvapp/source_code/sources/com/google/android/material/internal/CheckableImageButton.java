package com.google.android.material.internal;

import A3.f;
import F3.a;
import K.O;
import S.b;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.boxhdo.android.tv.R;
import k.C0912s;
/* loaded from: classes.dex */
public class CheckableImageButton extends C0912s implements Checkable {

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f8911w = {16842912};

    /* renamed from: t  reason: collision with root package name */
    public boolean f8912t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f8913u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f8914v;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        this.f8913u = true;
        this.f8914v = true;
        O.i(this, new f(1, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f8912t;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        return this.f8912t ? View.mergeDrawableStates(super.onCreateDrawableState(i7 + 1), f8911w) : super.onCreateDrawableState(i7);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f2938q);
        setChecked(aVar.f660s);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [F3.a, android.os.Parcelable, S.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new b(super.onSaveInstanceState());
        bVar.f660s = this.f8912t;
        return bVar;
    }

    public void setCheckable(boolean z7) {
        if (this.f8913u != z7) {
            this.f8913u = z7;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z7) {
        if (!this.f8913u || this.f8912t == z7) {
            return;
        }
        this.f8912t = z7;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z7) {
        this.f8914v = z7;
    }

    @Override // android.view.View
    public void setPressed(boolean z7) {
        if (this.f8914v) {
            super.setPressed(z7);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f8912t);
    }
}
