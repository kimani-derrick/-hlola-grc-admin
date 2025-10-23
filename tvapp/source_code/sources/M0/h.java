package M0;

import android.webkit.MimeTypeMap;
import java.io.File;
import v6.w;
/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public final File f2154a;

    public h(File file) {
        this.f2154a = file;
    }

    @Override // M0.g
    public final Object a(D5.d dVar) {
        String str = w.f15416r;
        File file = this.f2154a;
        K0.k kVar = new K0.k(u0.j.k(file), v6.k.f15396a, null, null);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String name = file.getName();
        M5.g.e(name, "getName(...)");
        return new m(kVar, singleton.getMimeTypeFromExtension(U5.f.y0(name, '.', "")), 3);
    }
}
