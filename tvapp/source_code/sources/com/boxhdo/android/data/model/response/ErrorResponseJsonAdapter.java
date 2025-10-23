package com.boxhdo.android.data.model.response;

import A5.v;
import M5.g;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.lang.reflect.Constructor;
import n5.k;
import n5.n;
import n5.q;
import n5.y;
import o5.e;
/* loaded from: classes.dex */
public final class ErrorResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7502a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7503b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Constructor f7504c;

    public ErrorResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7502a = D.G("message");
        this.f7503b = yVar.c(String.class, v.f137q, "message");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        String str = null;
        int i7 = -1;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7502a);
            if (X6 != -1) {
                if (X6 == 0) {
                    str = (String) this.f7503b.b(nVar);
                    i7 = -2;
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        if (i7 == -2) {
            return new ErrorResponse(str);
        }
        Constructor constructor = this.f7504c;
        if (constructor == null) {
            constructor = ErrorResponse.class.getDeclaredConstructor(String.class, Integer.TYPE, e.f12959c);
            this.f7504c = constructor;
            g.e(constructor, "ErrorResponse::class.jav…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, Integer.valueOf(i7), null);
        g.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (ErrorResponse) newInstance;
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        ErrorResponse errorResponse = (ErrorResponse) obj;
        g.f(qVar, "writer");
        if (errorResponse != null) {
            qVar.b();
            qVar.j("message");
            this.f7503b.f(qVar, errorResponse.f7501a);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(35, "GeneratedJsonAdapter(ErrorResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
