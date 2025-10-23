package J1;

import com.boxhdo.android.data.model.response.ShortcutResponse;
import com.boxhdo.domain.model.Shortcut;
/* loaded from: classes.dex */
public final class q implements l {

    /* renamed from: q  reason: collision with root package name */
    public final h f1315q;

    public q(h hVar) {
        M5.g.f(hVar, "filterMapper");
        this.f1315q = hVar;
    }

    @Override // J1.l
    public final Object s(Object obj) {
        ShortcutResponse shortcutResponse = (ShortcutResponse) obj;
        M5.g.f(shortcutResponse, "dto");
        String str = "";
        String str2 = shortcutResponse.f7647a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = shortcutResponse.f7648b;
        if (str3 != null) {
            str = str3;
        }
        return new Shortcut(str2, str, 0, this.f1315q.a(shortcutResponse.f7649c));
    }
}
