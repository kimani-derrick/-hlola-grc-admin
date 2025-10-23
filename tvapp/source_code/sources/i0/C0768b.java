package i0;

import B0.d;
import L4.f;
/* renamed from: i0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0768b {

    /* renamed from: a  reason: collision with root package name */
    public final C0767a f11316a;

    /* renamed from: b  reason: collision with root package name */
    public final C0767a f11317b;

    /* renamed from: c  reason: collision with root package name */
    public final d f11318c;
    public final f d;

    /* renamed from: e  reason: collision with root package name */
    public int f11319e;

    public C0768b(C0767a c0767a, C0767a c0767a2) {
        this.f11319e = 0;
        this.f11316a = c0767a;
        this.f11317b = c0767a2;
        this.f11318c = null;
        this.d = null;
    }

    public final String toString() {
        String str;
        d dVar = this.f11318c;
        if (dVar != null) {
            str = dVar.f149r;
        } else if (this.d != null) {
            str = "EntranceTransitionNotSupport";
        } else {
            str = "auto";
        }
        return "[" + this.f11316a.f11311a + " -> " + this.f11317b.f11311a + " <" + str + ">]";
    }

    public C0768b(C0767a c0767a, C0767a c0767a2, d dVar) {
        this.f11319e = 0;
        if (dVar == null) {
            throw new IllegalArgumentException();
        }
        this.f11316a = c0767a;
        this.f11317b = c0767a2;
        this.f11318c = dVar;
        this.d = null;
    }

    public C0768b(C0767a c0767a, C0767a c0767a2, f fVar) {
        this.f11319e = 0;
        if (fVar == null) {
            throw new IllegalArgumentException();
        }
        this.f11316a = c0767a;
        this.f11317b = c0767a2;
        this.f11318c = null;
        this.d = fVar;
    }
}
