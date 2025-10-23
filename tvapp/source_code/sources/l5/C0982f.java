package l5;

import android.view.View;
/* renamed from: l5.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0982f {

    /* renamed from: a  reason: collision with root package name */
    public final View f12290a;

    /* renamed from: b  reason: collision with root package name */
    public final View f12291b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12292c;

    public C0982f(View view, View view2, int i7) {
        this.f12290a = view;
        this.f12291b = view2;
        this.f12292c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0982f)) {
            return false;
        }
        C0982f c0982f = (C0982f) obj;
        if (M5.g.a(this.f12290a, c0982f.f12290a) && M5.g.a(this.f12291b, c0982f.f12291b) && this.f12292c == c0982f.f12292c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f12290a.hashCode() * 31;
        View view = this.f12291b;
        if (view == null) {
            hashCode = 0;
        } else {
            hashCode = view.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.f12292c;
    }

    public final String toString() {
        return "PendingAlignment(view=" + this.f12290a + ", childView=" + this.f12291b + ", sign=" + this.f12292c + ')';
    }
}
