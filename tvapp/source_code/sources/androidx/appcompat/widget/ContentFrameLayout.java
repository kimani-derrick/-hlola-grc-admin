package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import k.InterfaceC0867Q;
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: q  reason: collision with root package name */
    public TypedValue f5472q;

    /* renamed from: r  reason: collision with root package name */
    public TypedValue f5473r;

    /* renamed from: s  reason: collision with root package name */
    public TypedValue f5474s;

    /* renamed from: t  reason: collision with root package name */
    public TypedValue f5475t;

    /* renamed from: u  reason: collision with root package name */
    public TypedValue f5476u;

    /* renamed from: v  reason: collision with root package name */
    public TypedValue f5477v;

    /* renamed from: w  reason: collision with root package name */
    public final Rect f5478w;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f5478w = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f5476u == null) {
            this.f5476u = new TypedValue();
        }
        return this.f5476u;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f5477v == null) {
            this.f5477v = new TypedValue();
        }
        return this.f5477v;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f5474s == null) {
            this.f5474s = new TypedValue();
        }
        return this.f5474s;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f5475t == null) {
            this.f5475t = new TypedValue();
        }
        return this.f5475t;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f5472q == null) {
            this.f5472q = new TypedValue();
        }
        return this.f5472q;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f5473r == null) {
            this.f5473r = new TypedValue();
        }
        return this.f5473r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0867Q interfaceC0867Q) {
    }
}
