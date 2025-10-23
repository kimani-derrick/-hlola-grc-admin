package Z3;

import com.boxhdo.android.data.local.AppDatabase;
import com.google.crypto.tink.shaded.protobuf.AbstractC0523a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0530h;
import e4.X;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import z5.C1527i;
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4704a;

    /* renamed from: b  reason: collision with root package name */
    public final Serializable f4705b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f4706c;

    public e(AppDatabase appDatabase) {
        M5.g.f(appDatabase, "database");
        this.f4704a = appDatabase;
        this.f4705b = new AtomicBoolean(false);
        this.f4706c = new C1527i(new D0.h(18, this));
    }

    public D0.k a() {
        ((AppDatabase) this.f4704a).a();
        if (((AtomicBoolean) this.f4705b).compareAndSet(false, true)) {
            return (D0.k) ((C1527i) this.f4706c).getValue();
        }
        return b();
    }

    public D0.k b() {
        String c5 = c();
        AppDatabase appDatabase = (AppDatabase) this.f4704a;
        appDatabase.getClass();
        appDatabase.a();
        appDatabase.b();
        return appDatabase.g().K().f(c5);
    }

    public abstract String c();

    public int d() {
        return 1;
    }

    public abstract String e();

    public Object f(AbstractC0523a abstractC0523a, Class cls) {
        T3.f fVar = (T3.f) ((Map) this.f4706c).get(cls);
        if (fVar != null) {
            return fVar.a(abstractC0523a);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract P1.c g();

    public abstract X h();

    public abstract AbstractC0523a i(AbstractC0530h abstractC0530h);

    public void j(D0.k kVar) {
        M5.g.f(kVar, "statement");
        if (kVar == ((D0.k) ((C1527i) this.f4706c).getValue())) {
            ((AtomicBoolean) this.f4705b).set(false);
        }
    }

    public abstract void k(AbstractC0523a abstractC0523a);

    public e(Class cls, T3.f... fVarArr) {
        this.f4704a = cls;
        HashMap hashMap = new HashMap();
        for (T3.f fVar : fVarArr) {
            boolean containsKey = hashMap.containsKey(fVar.f3332a);
            Class cls2 = fVar.f3332a;
            if (containsKey) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls2.getCanonicalName());
            }
            hashMap.put(cls2, fVar);
        }
        this.f4705b = fVarArr.length > 0 ? fVarArr[0].f3332a : Void.class;
        this.f4706c = Collections.unmodifiableMap(hashMap);
    }
}
