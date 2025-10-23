package androidx.leanback.widget;

import android.graphics.PointF;
/* renamed from: androidx.leanback.widget.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0315s extends AbstractC0316t {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ C0321y f6648s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0315s(C0321y c0321y) {
        super(c0321y);
        this.f6648s = c0321y;
    }

    @Override // w0.C
    public final PointF e(int i7) {
        int i8;
        if (this.f15446b.f6895D.y() == 0) {
            return null;
        }
        C0321y c0321y = this.f6648s;
        int O5 = w0.U.O(c0321y.x(0));
        if ((c0321y.f6712z & 262144) == 0 ? i7 < O5 : i7 > O5) {
            i8 = -1;
        } else {
            i8 = 1;
        }
        if (c0321y.f6704r == 0) {
            return new PointF(i8, 0.0f);
        }
        return new PointF(0.0f, i8);
    }
}
