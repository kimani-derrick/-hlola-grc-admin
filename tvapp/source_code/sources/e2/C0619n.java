package e2;

import android.util.Base64;
/* renamed from: e2.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0619n implements N3.l {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f10019q;

    @Override // N3.l
    public final Object get() {
        switch (this.f10019q) {
            case 0:
                return new C0610i();
            default:
                byte[] bArr = new byte[12];
                f2.h.f10363i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
        }
    }
}
