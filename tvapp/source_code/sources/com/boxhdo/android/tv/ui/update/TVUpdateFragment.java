package com.boxhdo.android.tv.ui.update;

import A.h;
import A1.i;
import A1.j;
import A1.k;
import A1.l;
import F1.a;
import F1.m;
import F1.n;
import F1.v;
import H.e;
import M5.g;
import M5.p;
import W5.AbstractC0117y;
import W5.p0;
import a.AbstractC0189a;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.d;
import androidx.fragment.app.K;
import androidx.fragment.app.r;
import androidx.lifecycle.P;
import com.boxhdo.android.tv.R;
import com.boxhdo.android.tv.ui.update.TVUpdateFragment;
import com.boxhdo.android.tv.ui.update.TVUpdateViewModel;
import com.boxhdo.domain.model.LatestVersion;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import g5.b;
import j1.AbstractC0787E;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import q1.C1104f;
import w4.l0;
import z5.InterfaceC1522d;
/* loaded from: classes.dex */
public final class TVUpdateFragment extends a<TVUpdateViewModel, AbstractC0787E> {

    /* renamed from: u0  reason: collision with root package name */
    public final e f7919u0;

    /* renamed from: v0  reason: collision with root package name */
    public final b f7920v0;

    /* renamed from: w0  reason: collision with root package name */
    public final r f7921w0;

    /* renamed from: x0  reason: collision with root package name */
    public final r f7922x0;

    public TVUpdateFragment() {
        InterfaceC1522d A6 = h4.b.A(new j(new i(6, this), 5));
        this.f7919u0 = l0.k(this, p.a(TVUpdateViewModel.class), new k(A6, 10), new k(A6, 11), new l(this, 5, A6));
        this.f7920v0 = new b(p.a(n.class), 5, new i(5, this));
        this.f7921w0 = Y(new androidx.activity.result.b(this) { // from class: F1.c

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ TVUpdateFragment f630b;

            {
                this.f630b = this;
            }

            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        TVUpdateFragment tVUpdateFragment = this.f630b;
                        M5.g.f(tVUpdateFragment, "this$0");
                        M5.g.e(bool, "it");
                        if (bool.booleanValue() && tVUpdateFragment.s0()) {
                            tVUpdateFragment.x0(true);
                            TVUpdateViewModel h02 = tVUpdateFragment.h0();
                            p0 p0Var = h02.f7927k;
                            if (p0Var != null) {
                                p0Var.b(null);
                            }
                            h02.f7927k = h02.d(false, new v(h02, null));
                            return;
                        }
                        tVUpdateFragment.n0(new q1.l(R.string.msg_permission_denied), true);
                        return;
                    default:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        TVUpdateFragment tVUpdateFragment2 = this.f630b;
                        M5.g.f(tVUpdateFragment2, "this$0");
                        if (tVUpdateFragment2.r0()) {
                            s sVar = (s) ((C1104f) tVUpdateFragment2.h0().f7925i.getValue()).f13226a;
                            if (sVar instanceof p) {
                                tVUpdateFragment2.v0(((p) sVar).f649a);
                                return;
                            } else if (sVar instanceof q) {
                                tVUpdateFragment2.w0(((q) sVar).f650a);
                                return;
                            } else {
                                return;
                            }
                        }
                        tVUpdateFragment2.n0(new q1.l(R.string.msg_permission_denied), true);
                        return;
                }
            }
        }, new K(2));
        this.f7922x0 = Y(new androidx.activity.result.b(this) { // from class: F1.c

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ TVUpdateFragment f630b;

            {
                this.f630b = this;
            }

            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        TVUpdateFragment tVUpdateFragment = this.f630b;
                        M5.g.f(tVUpdateFragment, "this$0");
                        M5.g.e(bool, "it");
                        if (bool.booleanValue() && tVUpdateFragment.s0()) {
                            tVUpdateFragment.x0(true);
                            TVUpdateViewModel h02 = tVUpdateFragment.h0();
                            p0 p0Var = h02.f7927k;
                            if (p0Var != null) {
                                p0Var.b(null);
                            }
                            h02.f7927k = h02.d(false, new v(h02, null));
                            return;
                        }
                        tVUpdateFragment.n0(new q1.l(R.string.msg_permission_denied), true);
                        return;
                    default:
                        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                        TVUpdateFragment tVUpdateFragment2 = this.f630b;
                        M5.g.f(tVUpdateFragment2, "this$0");
                        if (tVUpdateFragment2.r0()) {
                            s sVar = (s) ((C1104f) tVUpdateFragment2.h0().f7925i.getValue()).f13226a;
                            if (sVar instanceof p) {
                                tVUpdateFragment2.v0(((p) sVar).f649a);
                                return;
                            } else if (sVar instanceof q) {
                                tVUpdateFragment2.w0(((q) sVar).f650a);
                                return;
                            } else {
                                return;
                            }
                        }
                        tVUpdateFragment2.n0(new q1.l(R.string.msg_permission_denied), true);
                        return;
                }
            }
        }, new K(3));
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void G(Bundle bundle) {
        super.G(bundle);
        TVUpdateViewModel h02 = h0();
        h02.getClass();
        LatestVersion latestVersion = ((n) this.f7920v0.getValue()).f648a;
        g.f(latestVersion, "version");
        h02.f7926j.f(latestVersion);
    }

    @Override // q1.t
    public final int g0() {
        return R.layout.fragment_tv_update;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
    @Override // q1.t
    public final void j0(int i7) {
        if (i7 == R.id.buttonUpdateNow) {
            if (!s0()) {
                q1.g m7 = m();
                if (m7 != null) {
                    new AlertDialog.Builder(m7).setMessage(R.string.message_request_permission).setPositiveButton(R.string.label_request_permission, new DialogInterface.OnClickListener() { // from class: F1.d
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i8) {
                            TVUpdateFragment tVUpdateFragment = TVUpdateFragment.this;
                            M5.g.f(tVUpdateFragment, "this$0");
                            try {
                                tVUpdateFragment.f7921w0.a("android.permission.WRITE_EXTERNAL_STORAGE");
                            } catch (Exception unused) {
                                tVUpdateFragment.n0(new q1.l(R.string.msg_unknown_error), true);
                            }
                        }
                    }).setNegativeButton(R.string.label_cancel, (DialogInterface.OnClickListener) new Object()).create().show();
                    return;
                }
                return;
            }
            x0(true);
            TVUpdateViewModel h02 = h0();
            p0 p0Var = h02.f7927k;
            if (p0Var != null) {
                p0Var.b(null);
            }
            h02.f7927k = h02.d(false, new v(h02, null));
            return;
        }
        try {
            if (i7 == R.id.buttonUpdateLater) {
                l0.o(this).h(R.id.goToMain, null);
            }
            if (i7 == R.id.buttonSkipVer) {
                l0.o(this).h(R.id.goToMain, null);
            }
            if (i7 == R.id.buttonCancel) {
                x0(false);
                TVUpdateViewModel h03 = h0();
                p0 p0Var2 = h03.f7927k;
                if (p0Var2 != null) {
                    p0Var2.b(null);
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    h03.g();
                    return;
                }
                File file = new File(h03.f7929m);
                if (file.exists()) {
                    file.delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // q1.t
    public final List l0(d dVar) {
        AbstractC0787E abstractC0787E = (AbstractC0787E) dVar;
        return A5.l.L(abstractC0787E.f11551u, abstractC0787E.f11550t, abstractC0787E.f11549s);
    }

    @Override // q1.t
    public final void o0() {
        ((AbstractC0787E) f0()).f11555y.setMovementMethod(LinkMovementMethod.getInstance());
        ((AbstractC0787E) f0()).f11551u.requestFocus();
        AbstractC0117y.p(P.g(w()), null, 0, new m(null, this), 3);
    }

    public final boolean r0() {
        boolean canRequestPackageInstalls;
        q1.g m7 = m();
        if (m7 == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            canRequestPackageInstalls = m7.getPackageManager().canRequestPackageInstalls();
            if (!canRequestPackageInstalls) {
                return false;
            }
        }
        return true;
    }

    public final boolean s0() {
        q1.g m7 = m();
        if (m7 == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return AbstractC0189a.n(m7, "android.permission.READ_EXTERNAL_STORAGE") == 0 && AbstractC0189a.n(m7, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    @Override // q1.t
    /* renamed from: t0 */
    public final TVUpdateViewModel h0() {
        return (TVUpdateViewModel) this.f7919u0.getValue();
    }

    public final void u0() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                this.f7922x0.a(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES").setData(Uri.parse(String.format("package:%s", Arrays.copyOf(new Object[]{Z().getPackageName()}, 1)))));
            } catch (Exception unused) {
                n0(new q1.l(R.string.msg_unknown_error), true);
            }
        }
    }

    public final void v0(File file) {
        q1.l lVar;
        if (!r0()) {
            u0();
            return;
        }
        if (file.exists()) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(y0(file), "application/vnd.android.package-archive");
                intent.addFlags(268435456);
                intent.addFlags(1);
                e0(intent);
                return;
            } catch (Exception unused) {
                lVar = new q1.l(R.string.msg_unknown_error);
            }
        } else {
            lVar = new q1.l(R.string.msg_unknown_error);
        }
        n0(lVar, true);
    }

    public final void w0(Uri uri) {
        if (!r0()) {
            u0();
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uri, "application/vnd.android.package-archive");
            intent.addFlags(268435456);
            intent.addFlags(1);
            e0(intent);
        } catch (Exception unused) {
            n0(new q1.l(R.string.msg_unknown_error), true);
        }
    }

    public final boolean x0(boolean z7) {
        AbstractC0787E abstractC0787E = (AbstractC0787E) f0();
        ConstraintLayout constraintLayout = abstractC0787E.f11553w;
        g.e(constraintLayout, "layoutDownloading");
        constraintLayout.setVisibility(z7 ? 0 : 8);
        ImageView imageView = abstractC0787E.f11552v;
        g.e(imageView, "imageMask");
        imageView.setVisibility(z7 ? 0 : 8);
        return (z7 ? abstractC0787E.f11548r : abstractC0787E.f11551u).requestFocus();
    }

    public final Uri y0(File file) {
        A.g gVar;
        if (Build.VERSION.SDK_INT < 24) {
            return Uri.fromFile(file);
        }
        Context a02 = a0();
        HashMap hashMap = h.f3r;
        synchronized (hashMap) {
            try {
                gVar = (A.g) hashMap.get("com.boxhdo.android.tv.provider");
                if (gVar == null) {
                    try {
                        try {
                            gVar = h.b(a02);
                            hashMap.put("com.boxhdo.android.tv.provider", gVar);
                        } catch (IOException e3) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                        }
                    } catch (XmlPullParserException e7) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e7);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : gVar.f1b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                String a7 = h.a(canonicalPath);
                String a8 = h.a(path);
                if (!a7.equals(a8)) {
                    if (a7.startsWith(a8 + '/')) {
                    }
                }
                if (entry == null || path.length() > ((File) entry.getValue()).getPath().length()) {
                    entry = entry2;
                }
            }
            if (entry != null) {
                String path2 = ((File) entry.getValue()).getPath();
                boolean endsWith = path2.endsWith("/");
                int length = path2.length();
                if (!endsWith) {
                    length++;
                }
                String substring = canonicalPath.substring(length);
                return new Uri.Builder().scheme("content").authority(gVar.f0a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(substring, "/")).build();
            }
            throw new IllegalArgumentException(AbstractC0515y1.x("Failed to find configured root that contains ", canonicalPath));
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
        }
    }
}
