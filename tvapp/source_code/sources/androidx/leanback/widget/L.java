package androidx.leanback.widget;

import android.graphics.Rect;
/* loaded from: classes.dex */
public final class L extends C0297i0 {
    public final HorizontalGridView n;

    /* renamed from: o  reason: collision with root package name */
    public K f6415o;

    /* renamed from: p  reason: collision with root package name */
    public final int f6416p;

    /* renamed from: q  reason: collision with root package name */
    public final int f6417q;

    /* renamed from: r  reason: collision with root package name */
    public final int f6418r;

    /* renamed from: s  reason: collision with root package name */
    public final int f6419s;

    public L(M m7, HorizontalGridView horizontalGridView) {
        super(m7);
        new Rect();
        this.n = horizontalGridView;
        this.f6416p = horizontalGridView.getPaddingTop();
        this.f6417q = horizontalGridView.getPaddingBottom();
        this.f6418r = horizontalGridView.getPaddingLeft();
        this.f6419s = horizontalGridView.getPaddingRight();
    }
}
