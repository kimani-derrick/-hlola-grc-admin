package O0;

import M5.g;
import S0.k;
import X0.e;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
/* loaded from: classes.dex */
public final class c implements b {
    @Override // O0.b
    public final String a(Object obj, k kVar) {
        Uri uri = (Uri) obj;
        if (g.a(uri.getScheme(), "android.resource")) {
            StringBuilder sb = new StringBuilder();
            sb.append(uri);
            sb.append('-');
            Configuration configuration = kVar.f3042a.getResources().getConfiguration();
            Bitmap.Config[] configArr = e.f4059a;
            sb.append(configuration.uiMode & 48);
            return sb.toString();
        }
        return uri.toString();
    }
}
