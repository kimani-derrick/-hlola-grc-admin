package g2;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
/* renamed from: g2.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0719j extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final ContentResolver f10690a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f10691b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0720k f10692c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0719j(C0720k c0720k, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f10692c = c0720k;
        this.f10690a = contentResolver;
        this.f10691b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z7) {
        C0720k c0720k = this.f10692c;
        C0720k.a(c0720k, C0716g.b((Context) c0720k.f10694b));
    }
}
