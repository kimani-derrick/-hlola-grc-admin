package P0;

import M5.g;
import S0.k;
import U5.n;
import X0.e;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import h6.t;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import w4.l0;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2762a;

    public /* synthetic */ a(int i7) {
        this.f2762a = i7;
    }

    public final Object a(Object obj, k kVar) {
        String authority;
        switch (this.f2762a) {
            case 0:
                return ByteBuffer.wrap((byte[]) obj);
            case 1:
                Uri uri = (Uri) obj;
                if (e.e(uri)) {
                    return null;
                }
                String scheme = uri.getScheme();
                if (scheme != null && !g.a(scheme, "file")) {
                    return null;
                }
                String path = uri.getPath();
                if (path == null) {
                    path = "";
                }
                if (path.length() <= 0 || !l0.n(path.charAt(0), '/', false) || ((String) A5.k.X(uri.getPathSegments())) == null) {
                    return null;
                }
                if (g.a(uri.getScheme(), "file")) {
                    String path2 = uri.getPath();
                    if (path2 == null) {
                        return null;
                    }
                    return new File(path2);
                }
                return new File(uri.toString());
            case 2:
                return ((t) obj).f11210i;
            case 3:
                Context context = kVar.f3042a;
                int intValue = ((Number) obj).intValue();
                try {
                    if (context.getResources().getResourceEntryName(intValue) != null) {
                        Uri parse = Uri.parse("android.resource://" + context.getPackageName() + '/' + intValue);
                        g.e(parse, "parse(this)");
                        return parse;
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            case 4:
                Uri uri2 = (Uri) obj;
                if (g.a(uri2.getScheme(), "android.resource") && (authority = uri2.getAuthority()) != null && !n.X(authority) && uri2.getPathSegments().size() == 2) {
                    String authority2 = uri2.getAuthority();
                    if (authority2 == null) {
                        authority2 = "";
                    }
                    Resources resourcesForApplication = kVar.f3042a.getPackageManager().getResourcesForApplication(authority2);
                    List<String> pathSegments = uri2.getPathSegments();
                    int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                    if (identifier != 0) {
                        Uri parse2 = Uri.parse("android.resource://" + authority2 + '/' + identifier);
                        g.e(parse2, "parse(this)");
                        return parse2;
                    }
                    throw new IllegalStateException(("Invalid android.resource URI: " + uri2).toString());
                }
                return null;
            default:
                Uri parse3 = Uri.parse((String) obj);
                g.e(parse3, "parse(this)");
                return parse3;
        }
    }
}
