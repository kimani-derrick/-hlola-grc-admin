package J1;

import com.boxhdo.android.data.model.response.VersionSettingsResponse;
/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: q  reason: collision with root package name */
    public final k f1302q;

    public a(k kVar) {
        M5.g.f(kVar, "lastVersionMapper");
        this.f1302q = kVar;
    }

    @Override // J1.l
    public final Object s(Object obj) {
        VersionSettingsResponse versionSettingsResponse = (VersionSettingsResponse) obj;
        M5.g.f(versionSettingsResponse, "dto");
        this.f1302q.getClass();
        return k.a(versionSettingsResponse.f7705a);
    }
}
