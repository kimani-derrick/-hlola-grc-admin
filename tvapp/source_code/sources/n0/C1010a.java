package n0;

import android.os.Bundle;
/* renamed from: n0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1010a implements w {

    /* renamed from: a  reason: collision with root package name */
    public final int f12518a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f12519b = new Bundle();

    public C1010a(int i7) {
        this.f12518a = i7;
    }

    @Override // n0.w
    public final int a() {
        return this.f12518a;
    }

    @Override // n0.w
    public final Bundle b() {
        return this.f12519b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && M5.g.a(C1010a.class, obj.getClass()) && this.f12518a == ((C1010a) obj).f12518a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 31 + this.f12518a;
    }

    public final String toString() {
        return "ActionOnlyNavDirections(actionId=" + this.f12518a + ')';
    }
}
