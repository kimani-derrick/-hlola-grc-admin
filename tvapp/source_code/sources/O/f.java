package O;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
/* loaded from: classes.dex */
public final class f implements g {

    /* renamed from: q  reason: collision with root package name */
    public final InputContentInfo f2546q;

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f2546q = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // O.g
    public final void b() {
        this.f2546q.requestPermission();
    }

    @Override // O.g
    public final Uri c() {
        return this.f2546q.getLinkUri();
    }

    @Override // O.g
    public final ClipDescription e() {
        return this.f2546q.getDescription();
    }

    @Override // O.g
    public final Object f() {
        return this.f2546q;
    }

    @Override // O.g
    public final Uri g() {
        return this.f2546q.getContentUri();
    }

    public f(Object obj) {
        this.f2546q = (InputContentInfo) obj;
    }
}
