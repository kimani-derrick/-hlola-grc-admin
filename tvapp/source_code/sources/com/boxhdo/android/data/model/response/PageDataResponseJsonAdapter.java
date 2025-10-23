package com.boxhdo.android.data.model.response;

import A5.v;
import M5.g;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.lang.reflect.Type;
import java.util.List;
import n5.AbstractC1043D;
import n5.k;
import n5.n;
import n5.q;
import n5.y;
/* loaded from: classes.dex */
public final class PageDataResponseJsonAdapter<T> extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7621a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7622b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7623c;

    public PageDataResponseJsonAdapter(y yVar, Type[] typeArr) {
        g.f(yVar, "moshi");
        g.f(typeArr, "types");
        if (typeArr.length == 1) {
            this.f7621a = D.G("page", "limit", "total_pages", "count", "rows");
            v vVar = v.f137q;
            this.f7622b = yVar.c(Integer.class, vVar, "page");
            this.f7623c = yVar.c(AbstractC1043D.f(typeArr[0]), vVar, "result");
            return;
        }
        String str = "TypeVariable mismatch: Expecting 1 type for generic type variables [T], but received " + typeArr.length;
        g.e(str, "StringBuilder().apply(builderAction).toString()");
        throw new IllegalArgumentException(str.toString());
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        List list = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7621a);
            if (X6 != -1) {
                k kVar = this.f7622b;
                if (X6 != 0) {
                    if (X6 != 1) {
                        if (X6 != 2) {
                            if (X6 != 3) {
                                if (X6 == 4) {
                                    list = (List) this.f7623c.b(nVar);
                                }
                            } else {
                                num4 = (Integer) kVar.b(nVar);
                            }
                        } else {
                            num3 = (Integer) kVar.b(nVar);
                        }
                    } else {
                        num2 = (Integer) kVar.b(nVar);
                    }
                } else {
                    num = (Integer) kVar.b(nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        return new PageDataResponse(num, num2, num3, num4, list);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        PageDataResponse pageDataResponse = (PageDataResponse) obj;
        g.f(qVar, "writer");
        if (pageDataResponse != null) {
            qVar.b();
            qVar.j("page");
            k kVar = this.f7622b;
            kVar.f(qVar, pageDataResponse.f7617a);
            qVar.j("limit");
            kVar.f(qVar, pageDataResponse.f7618b);
            qVar.j("total_pages");
            kVar.f(qVar, pageDataResponse.f7619c);
            qVar.j("count");
            kVar.f(qVar, pageDataResponse.d);
            qVar.j("rows");
            this.f7623c.f(qVar, pageDataResponse.f7620e);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(38, "GeneratedJsonAdapter(PageDataResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
