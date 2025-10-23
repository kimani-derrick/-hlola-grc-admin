package f1;

import W5.InterfaceC0116x;
import a1.C0197a;
import android.content.SharedPreferences;
import com.boxhdo.android.data.model.response.AllSettingsResponse;
import com.boxhdo.android.data.model.response.DownloaderResponse;
import com.boxhdo.android.data.model.response.ListPlayerResponse;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e1.InterfaceC0567a;
import k3.AbstractC0958a;
import w4.l0;
import z5.C1530l;
/* loaded from: classes.dex */
public final class w extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f10327u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C0660A f10328v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(C0660A c0660a, D5.d dVar) {
        super(2, dVar);
        this.f10328v = c0660a;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new w(this.f10328v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((w) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f10327u;
        C0660A c0660a = this.f10328v;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            InterfaceC0567a b7 = c0660a.f10205a.b();
            String m7 = AbstractC0515y1.m(l0.s(c0660a.f10207c), g6.o.f10858a.c());
            this.f10327u = 1;
            obj = b7.d(m7, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        AllSettingsResponse allSettingsResponse = (AllSettingsResponse) obj;
        C0197a c0197a = c0660a.f10207c;
        g6.o oVar = g6.o.f10858a;
        String y3 = oVar.y();
        ListPlayerResponse listPlayerResponse = allSettingsResponse.f7403a;
        SharedPreferences.Editor edit = c0197a.f4980a.edit();
        if (listPlayerResponse instanceof String) {
            ((B0.a) edit).putString(y3, (String) listPlayerResponse);
        } else if (listPlayerResponse instanceof Float) {
            ((B0.a) edit).putFloat(y3, ((Number) listPlayerResponse).floatValue());
        } else if (listPlayerResponse instanceof Integer) {
            ((B0.a) edit).putInt(y3, ((Number) listPlayerResponse).intValue());
        } else if (listPlayerResponse instanceof Long) {
            ((B0.a) edit).putLong(y3, ((Number) listPlayerResponse).longValue());
        } else if (listPlayerResponse instanceof Boolean) {
            ((B0.a) edit).putBoolean(y3, ((Boolean) listPlayerResponse).booleanValue());
        } else {
            ((B0.a) edit).putString(y3, c0197a.f4981b.a(ListPlayerResponse.class).e(listPlayerResponse));
        }
        ((B0.a) edit).apply();
        C0197a c0197a2 = c0660a.f10207c;
        String n = oVar.n();
        SharedPreferences.Editor edit2 = c0197a2.f4980a.edit();
        DownloaderResponse downloaderResponse = allSettingsResponse.f7404b;
        if (downloaderResponse instanceof String) {
            ((B0.a) edit2).putString(n, (String) downloaderResponse);
        } else if (downloaderResponse instanceof Float) {
            ((B0.a) edit2).putFloat(n, ((Number) downloaderResponse).floatValue());
        } else if (downloaderResponse instanceof Integer) {
            ((B0.a) edit2).putInt(n, ((Number) downloaderResponse).intValue());
        } else if (downloaderResponse instanceof Long) {
            ((B0.a) edit2).putLong(n, ((Number) downloaderResponse).longValue());
        } else if (downloaderResponse instanceof Boolean) {
            ((B0.a) edit2).putBoolean(n, ((Boolean) downloaderResponse).booleanValue());
        } else {
            ((B0.a) edit2).putString(n, c0197a2.f4981b.a(DownloaderResponse.class).e(downloaderResponse));
        }
        ((B0.a) edit2).apply();
        C0197a c0197a3 = c0660a.f10207c;
        String u7 = oVar.u();
        Integer num = new Integer(oVar.a(allSettingsResponse.f7405c));
        SharedPreferences.Editor edit3 = c0197a3.f4980a.edit();
        if (num instanceof String) {
            ((B0.a) edit3).putString(u7, (String) num);
        } else if (num instanceof Float) {
            ((B0.a) edit3).putFloat(u7, num.floatValue());
        } else {
            ((B0.a) edit3).putInt(u7, num.intValue());
        }
        ((B0.a) edit3).apply();
        return new Y0.b(allSettingsResponse);
    }
}
