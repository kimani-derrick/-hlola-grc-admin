package com.boxhdo.android.data.model.response;

import A5.v;
import M5.g;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.lang.reflect.Type;
import n5.k;
import n5.n;
import n5.q;
import n5.y;
/* loaded from: classes.dex */
public final class ResultResponseJsonAdapter<T> extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7637a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7638b;

    public ResultResponseJsonAdapter(y yVar, Type[] typeArr) {
        g.f(yVar, "moshi");
        g.f(typeArr, "types");
        if (typeArr.length == 1) {
            this.f7637a = D.G("result");
            this.f7638b = yVar.c(typeArr[0], v.f137q, "result");
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
        Object obj = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7637a);
            if (X6 != -1) {
                if (X6 == 0) {
                    obj = this.f7638b.b(nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        return new ResultResponse(obj);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        ResultResponse resultResponse = (ResultResponse) obj;
        g.f(qVar, "writer");
        if (resultResponse != null) {
            qVar.b();
            qVar.j("result");
            this.f7638b.f(qVar, resultResponse.f7636a);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(36, "GeneratedJsonAdapter(ResultResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
