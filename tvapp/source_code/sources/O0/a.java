package O0;

import S0.k;
import java.io.File;
/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2547a;

    public a(boolean z7) {
        this.f2547a = z7;
    }

    @Override // O0.b
    public final String a(Object obj, k kVar) {
        File file = (File) obj;
        if (this.f2547a) {
            return file.getPath() + ':' + file.lastModified();
        }
        return file.getPath();
    }
}
