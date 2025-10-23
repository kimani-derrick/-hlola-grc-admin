package androidx.leanback.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
/* renamed from: androidx.leanback.widget.c0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0285c0 extends ViewOutlineProvider {

    /* renamed from: a  reason: collision with root package name */
    public int f6575a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f6575a);
        outline.setAlpha(1.0f);
    }
}
