package com.boxhdo.android.tv.ui.activity.player;

import A5.m;
import D0.h;
import H.e;
import H2.AbstractC0000a;
import M5.p;
import O3.E;
import O3.U;
import P1.c;
import U5.n;
import W2.w;
import W5.AbstractC0117y;
import W5.InterfaceC0093a0;
import X2.C0122d;
import Y2.C0136e;
import Y2.C0150t;
import Y2.InterfaceC0137f;
import Z2.AbstractC0156a;
import Z2.D;
import Z2.H;
import a3.z;
import a4.C0214f;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.AudioTrack;
import android.net.Uri;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.d;
import androidx.fragment.app.C0247a;
import androidx.fragment.app.S;
import androidx.lifecycle.P;
import com.boxhdo.android.tv.R;
import com.boxhdo.android.tv.ui.activity.player.TvPlayerActivity;
import com.boxhdo.domain.model.EpisodeSource;
import com.boxhdo.domain.model.GeneralConfig;
import com.boxhdo.domain.model.Movie;
import com.boxhdo.domain.model.StreamUrl;
import com.boxhdo.domain.model.SubtitleSource;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.android.exoplayer2.ui.SubtitleView;
import com.google.android.gms.internal.measurement.S1;
import dagger.hilt.android.internal.managers.b;
import e2.AbstractC0592I;
import e2.C0584A;
import e2.C0585B;
import e2.C0587D;
import e2.C0597b0;
import e2.C0598c;
import e2.C0616l;
import e2.C0617l0;
import e2.InterfaceC0621p;
import e2.L0;
import e2.N;
import e2.O;
import e2.Q;
import e2.T;
import e2.V;
import e2.X;
import e2.Y;
import e2.Z;
import e2.p0;
import e2.q0;
import e2.r0;
import e2.s0;
import e2.t0;
import e2.u0;
import e2.z0;
import f2.f;
import h1.C0745d;
import j1.AbstractC0803a;
import j1.AbstractC0825w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import n1.C1026a;
import o1.B;
import o1.C1061f;
import o1.F;
import o1.G;
import o1.j;
import o1.u;
import o1.v;
import o1.y;
import p1.C1083d;
import q1.C1104f;
import q1.g;
import r0.AbstractC1111a;
import t2.i;
import u5.C1298f;
import u5.InterfaceC1293a;
import w5.InterfaceC1437b;
import x2.C1461c;
import z5.C1524f;
import z5.C1527i;
/* loaded from: classes.dex */
public final class TvPlayerActivity extends g implements t0, InterfaceC1437b {

    /* renamed from: Y  reason: collision with root package name */
    public static final /* synthetic */ int f7794Y = 0;

    /* renamed from: Q  reason: collision with root package name */
    public volatile b f7795Q;

    /* renamed from: R  reason: collision with root package name */
    public final Object f7796R = new Object();

    /* renamed from: S  reason: collision with root package name */
    public boolean f7797S = false;

    /* renamed from: T  reason: collision with root package name */
    public final g5.b f7798T;

    /* renamed from: U  reason: collision with root package name */
    public final C1527i f7799U;

    /* renamed from: V  reason: collision with root package name */
    public final e f7800V;
    public AbstractC0825w W;

    /* renamed from: X  reason: collision with root package name */
    public InterfaceC0093a0 f7801X;

    public TvPlayerActivity() {
        H(new C1026a(this, 1));
        this.f7798T = new g5.b(p.a(v.class), 5, new h(14, this));
        this.f7799U = new C1527i(new h(13, this));
        this.f7800V = new e(p.a(TvPlayerViewModel.class), new n1.p(this, 4), new n1.p(this, 3), new n1.p(this, 5));
    }

    @Override // e2.t0
    public final /* synthetic */ void A(w wVar) {
    }

    @Override // e2.t0
    public final /* synthetic */ void B(List list) {
    }

    @Override // e2.t0
    public final /* synthetic */ void D(int i7, boolean z7) {
    }

    @Override // e2.t0
    public final /* synthetic */ void E(int i7, boolean z7) {
    }

    @Override // e2.t0
    public final /* synthetic */ void G(r0 r0Var) {
    }

    @Override // e2.t0
    public final /* synthetic */ void I(int i7, u0 u0Var, u0 u0Var2) {
    }

    @Override // e2.t0
    public final /* synthetic */ void K(C1461c c1461c) {
    }

    @Override // e2.t0
    public final void L(boolean z7) {
        ImageView imageView;
        AbstractC0825w abstractC0825w = this.W;
        if (abstractC0825w == null || (imageView = abstractC0825w.f11745s) == null) {
            return;
        }
        imageView.setImageResource(z7 ? R.drawable.ic_pause : R.drawable.ic_play);
    }

    @Override // q1.g
    public final int V() {
        return R.layout.activity_player;
    }

    @Override // q1.g
    public final void a0() {
        d dVar;
        Typeface typeface;
        Resources resources;
        getWindow().addFlags(128);
        AbstractC0117y.p(P.g(this), null, 0, new u(null, this), 3);
        TvPlayerViewModel d02 = d0();
        Movie movie = b0().f12880a;
        M5.g.f(movie, "movie");
        d02.d(false, new B(d02, movie, null));
        View findViewById = ((AbstractC0803a) U()).f5662g.findViewById(R.id.playControllerView);
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.b.f5656a;
        if (findViewById != null) {
            dVar = (d) findViewById.getTag(R.id.dataBinding);
        } else {
            dVar = null;
        }
        if (dVar == null) {
            Object tag = findViewById.getTag();
            if (tag instanceof String) {
                DataBinderMapperImpl dataBinderMapperImpl2 = androidx.databinding.b.f5656a;
                int d = dataBinderMapperImpl2.d((String) tag);
                if (d != 0) {
                    dVar = dataBinderMapperImpl2.b(findViewById, d);
                } else {
                    throw new IllegalArgumentException(AbstractC1111a.p(tag, "View is not a binding layout. Tag: "));
                }
            } else {
                throw new IllegalArgumentException("View is not a binding layout");
            }
        }
        AbstractC0825w abstractC0825w = (AbstractC0825w) dVar;
        this.W = abstractC0825w;
        if (abstractC0825w != null) {
            TextView textView = abstractC0825w.f11740A;
            CharSequence text = textView.getText();
            if (text == null || n.X(text)) {
                textView.setText(b0().f12880a.f8032t);
            }
            View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: o1.g

                /* renamed from: r  reason: collision with root package name */
                public final /* synthetic */ TvPlayerActivity f12852r;

                {
                    this.f12852r = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TvPlayerActivity tvPlayerActivity = this.f12852r;
                    switch (r2) {
                        case 0:
                            int i7 = TvPlayerActivity.f7794Y;
                            M5.g.f(tvPlayerActivity, "this$0");
                            if (((P1.c) tvPlayerActivity.c0()).r()) {
                                P1.c cVar = (P1.c) tvPlayerActivity.c0();
                                cVar.getClass();
                                ((C0585B) cVar).g0(false);
                                return;
                            }
                            P1.c cVar2 = (P1.c) tvPlayerActivity.c0();
                            cVar2.getClass();
                            ((C0585B) cVar2).g0(true);
                            return;
                        case 1:
                            int i8 = TvPlayerActivity.f7794Y;
                            M5.g.f(tvPlayerActivity, "this$0");
                            tvPlayerActivity.finish();
                            return;
                        case 2:
                            int i9 = TvPlayerActivity.f7794Y;
                            M5.g.f(tvPlayerActivity, "this$0");
                            S W = tvPlayerActivity.W();
                            W.getClass();
                            C0247a c0247a = new C0247a(W);
                            c0247a.f(R.id.container, new C1083d(), null, 1);
                            c0247a.c(null);
                            c0247a.e(true);
                            return;
                        case 3:
                            int i10 = TvPlayerActivity.f7794Y;
                            M5.g.f(tvPlayerActivity, "this$0");
                            new C1057b().i0(tvPlayerActivity.W(), null);
                            return;
                        default:
                            int i11 = TvPlayerActivity.f7794Y;
                            M5.g.f(tvPlayerActivity, "this$0");
                            new C1059d().i0(tvPlayerActivity.W(), null);
                            return;
                    }
                }
            };
            ImageView imageView = abstractC0825w.f11745s;
            imageView.setOnClickListener(onClickListener);
            abstractC0825w.f11744r.setOnClickListener(new View.OnClickListener(this) { // from class: o1.g

                /* renamed from: r  reason: collision with root package name */
                public final /* synthetic */ TvPlayerActivity f12852r;

                {
                    this.f12852r = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TvPlayerActivity tvPlayerActivity = this.f12852r;
                    switch (r2) {
                        case 0:
                            int i7 = TvPlayerActivity.f7794Y;
                            M5.g.f(tvPlayerActivity, "this$0");
                            if (((P1.c) tvPlayerActivity.c0()).r()) {
                                P1.c cVar = (P1.c) tvPlayerActivity.c0();
                                cVar.getClass();
                                ((C0585B) cVar).g0(false);
                                return;
                            }
                            P1.c cVar2 = (P1.c) tvPlayerActivity.c0();
                            cVar2.getClass();
                            ((C0585B) cVar2).g0(true);
                            return;
                        case 1:
                            int i8 = TvPlayerActivity.f7794Y;
                            M5.g.f(tvPlayerActivity, "this$0");
                            tvPlayerActivity.finish();
                            return;
                        case 2:
                            int i9 = TvPlayerActivity.f7794Y;
                            M5.g.f(tvPlayerActivity, "this$0");
                            S W = tvPlayerActivity.W();
                            W.getClass();
                            C0247a c0247a = new C0247a(W);
                            c0247a.f(R.id.container, new C1083d(), null, 1);
                            c0247a.c(null);
                            c0247a.e(true);
                            return;
                        case 3:
                            int i10 = TvPlayerActivity.f7794Y;
                            M5.g.f(tvPlayerActivity, "this$0");
                            new C1057b().i0(tvPlayerActivity.W(), null);
                            return;
                        default:
                            int i11 = TvPlayerActivity.f7794Y;
                            M5.g.f(tvPlayerActivity, "this$0");
                            new C1059d().i0(tvPlayerActivity.W(), null);
                            return;
                    }
                }
            });
            abstractC0825w.f11748v.setOnClickListener(new View.OnClickListener(this) { // from class: o1.g

                /* renamed from: r  reason: collision with root package name */
                public final /* synthetic */ TvPlayerActivity f12852r;

                {
                    this.f12852r = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TvPlayerActivity tvPlayerActivity = this.f12852r;
                    switch (r2) {
                        case 0:
                            int i7 = TvPlayerActivity.f7794Y;
                            M5.g.f(tvPlayerActivity, "this$0");
                            if (((P1.c) tvPlayerActivity.c0()).r()) {
                                P1.c cVar = (P1.c) tvPlayerActivity.c0();
                                cVar.getClass();
                                ((C0585B) cVar).g0(false);
                                return;
                            }
                            P1.c cVar2 = (P1.c) tvPlayerActivity.c0();
                            cVar2.getClass();
                            ((C0585B) cVar2).g0(true);
                            return;
                        case 1:
                            int i8 = TvPlayerActivity.f7794Y;
                            M5.g.f(tvPlayerActivity, "this$0");
                            tvPlayerActivity.finish();
                            return;
                        case 2:
                            int i9 = TvPlayerActivity.f7794Y;
                            M5.g.f(tvPlayerActivity, "this$0");
                            S W = tvPlayerActivity.W();
                            W.getClass();
                            C0247a c0247a = new C0247a(W);
                            c0247a.f(R.id.container, new C1083d(), null, 1);
                            c0247a.c(null);
                            c0247a.e(true);
                            return;
                        case 3:
                            int i10 = TvPlayerActivity.f7794Y;
                            M5.g.f(tvPlayerActivity, "this$0");
                            new C1057b().i0(tvPlayerActivity.W(), null);
                            return;
                        default:
                            int i11 = TvPlayerActivity.f7794Y;
                            M5.g.f(tvPlayerActivity, "this$0");
                            new C1059d().i0(tvPlayerActivity.W(), null);
                            return;
                    }
                }
            });
            abstractC0825w.f11746t.setOnClickListener(new View.OnClickListener(this) { // from class: o1.g

                /* renamed from: r  reason: collision with root package name */
                public final /* synthetic */ TvPlayerActivity f12852r;

                {
                    this.f12852r = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TvPlayerActivity tvPlayerActivity = this.f12852r;
                    switch (r2) {
                        case 0:
                            int i7 = TvPlayerActivity.f7794Y;
                            M5.g.f(tvPlayerActivity, "this$0");
                            if (((P1.c) tvPlayerActivity.c0()).r()) {
                                P1.c cVar = (P1.c) tvPlayerActivity.c0();
                                cVar.getClass();
                                ((C0585B) cVar).g0(false);
                                return;
                            }
                            P1.c cVar2 = (P1.c) tvPlayerActivity.c0();
                            cVar2.getClass();
                            ((C0585B) cVar2).g0(true);
                            return;
                        case 1:
                            int i8 = TvPlayerActivity.f7794Y;
                            M5.g.f(tvPlayerActivity, "this$0");
                            tvPlayerActivity.finish();
                            return;
                        case 2:
                            int i9 = TvPlayerActivity.f7794Y;
                            M5.g.f(tvPlayerActivity, "this$0");
                            S W = tvPlayerActivity.W();
                            W.getClass();
                            C0247a c0247a = new C0247a(W);
                            c0247a.f(R.id.container, new C1083d(), null, 1);
                            c0247a.c(null);
                            c0247a.e(true);
                            return;
                        case 3:
                            int i10 = TvPlayerActivity.f7794Y;
                            M5.g.f(tvPlayerActivity, "this$0");
                            new C1057b().i0(tvPlayerActivity.W(), null);
                            return;
                        default:
                            int i11 = TvPlayerActivity.f7794Y;
                            M5.g.f(tvPlayerActivity, "this$0");
                            new C1059d().i0(tvPlayerActivity.W(), null);
                            return;
                    }
                }
            });
            abstractC0825w.f11747u.setOnClickListener(new View.OnClickListener(this) { // from class: o1.g

                /* renamed from: r  reason: collision with root package name */
                public final /* synthetic */ TvPlayerActivity f12852r;

                {
                    this.f12852r = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TvPlayerActivity tvPlayerActivity = this.f12852r;
                    switch (r2) {
                        case 0:
                            int i7 = TvPlayerActivity.f7794Y;
                            M5.g.f(tvPlayerActivity, "this$0");
                            if (((P1.c) tvPlayerActivity.c0()).r()) {
                                P1.c cVar = (P1.c) tvPlayerActivity.c0();
                                cVar.getClass();
                                ((C0585B) cVar).g0(false);
                                return;
                            }
                            P1.c cVar2 = (P1.c) tvPlayerActivity.c0();
                            cVar2.getClass();
                            ((C0585B) cVar2).g0(true);
                            return;
                        case 1:
                            int i8 = TvPlayerActivity.f7794Y;
                            M5.g.f(tvPlayerActivity, "this$0");
                            tvPlayerActivity.finish();
                            return;
                        case 2:
                            int i9 = TvPlayerActivity.f7794Y;
                            M5.g.f(tvPlayerActivity, "this$0");
                            S W = tvPlayerActivity.W();
                            W.getClass();
                            C0247a c0247a = new C0247a(W);
                            c0247a.f(R.id.container, new C1083d(), null, 1);
                            c0247a.c(null);
                            c0247a.e(true);
                            return;
                        case 3:
                            int i10 = TvPlayerActivity.f7794Y;
                            M5.g.f(tvPlayerActivity, "this$0");
                            new C1057b().i0(tvPlayerActivity.W(), null);
                            return;
                        default:
                            int i11 = TvPlayerActivity.f7794Y;
                            M5.g.f(tvPlayerActivity, "this$0");
                            new C1059d().i0(tvPlayerActivity.W(), null);
                            return;
                    }
                }
            });
            i0();
            abstractC0825w.f11750x.setFocusable(false);
            imageView.requestFocus();
        }
        ((AbstractC0803a) U()).f11607r.setPlayer(c0());
        StyledPlayerView styledPlayerView = ((AbstractC0803a) U()).f11607r;
        M5.g.e(styledPlayerView, "binding.playerView");
        SubtitleView subtitleView = styledPlayerView.getSubtitleView();
        if (subtitleView != null) {
            subtitleView.setApplyEmbeddedStyles(false);
            subtitleView.setApplyEmbeddedFontSizes(false);
            GeneralConfig a7 = d0().f.a();
            int argb = Color.argb(128, 0, 0, 0);
            int ordinal = d0().f.a().f7988e.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal == 4) {
                                typeface = Typeface.MONOSPACE;
                            } else {
                                throw new RuntimeException();
                            }
                        } else {
                            typeface = Typeface.SERIF;
                        }
                    } else {
                        typeface = Typeface.SANS_SERIF;
                    }
                } else {
                    typeface = Typeface.DEFAULT_BOLD;
                }
            } else {
                typeface = Typeface.DEFAULT;
            }
            subtitleView.setStyle(new C0122d(a7.f7986b, argb, 0, 2, 0, typeface));
            subtitleView.setPadding(0, 0, 0, subtitleView.getResources().getDimensionPixelSize(R.dimen.dp_80));
            Context context = subtitleView.getContext();
            if (context == null) {
                resources = Resources.getSystem();
            } else {
                resources = context.getResources();
            }
            float applyDimension = TypedValue.applyDimension(2, 28.0f, resources.getDisplayMetrics());
            subtitleView.f8199s = 2;
            subtitleView.f8200t = applyDimension;
            subtitleView.c();
        }
        ((AbstractC0803a) U()).f11607r.setControllerAutoShow(true);
        ProgressBar progressBar = (ProgressBar) ((AbstractC0803a) U()).f11607r.findViewById(R.id.exo_buffering);
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(A.b.a(progressBar.getContext(), R.color.colorPrimary)));
        C0585B c0585b = (C0585B) c0();
        c0585b.getClass();
        c0585b.f9421B.a(this);
        W().f5933m.add(new C1061f(0, this));
        EpisodeSource episodeSource = b0().f12881b;
        if (episodeSource != null) {
            TvPlayerViewModel d03 = d0();
            d03.d(false, new G(d03, episodeSource, null));
            d0().f7810p = episodeSource;
            e0(episodeSource, b0().f12883e);
        }
    }

    @Override // e2.t0
    public final /* synthetic */ void b(int i7) {
    }

    public final v b0() {
        return (v) this.f7798T.getValue();
    }

    @Override // e2.t0
    public final void c(int i7) {
        DefaultTimeBar defaultTimeBar;
        if (i7 != 3) {
            if (i7 == 4) {
                d0().h(b0().f12880a, ((C0585B) c0()).R(), ((C0585B) c0()).R());
                return;
            }
            return;
        }
        AbstractC0117y.p(P.g(this), null, 0, new j(null, this), 3);
        AbstractC0825w abstractC0825w = this.W;
        if (abstractC0825w != null && (defaultTimeBar = abstractC0825w.f11750x) != null) {
            defaultTimeBar.setDuration(((C0585B) c0()).R());
        }
    }

    public final InterfaceC0621p c0() {
        return (InterfaceC0621p) this.f7799U.getValue();
    }

    @Override // e2.t0
    public final /* synthetic */ void d(int i7) {
    }

    public final TvPlayerViewModel d0() {
        return (TvPlayerViewModel) this.f7800V.getValue();
    }

    @Override // z.e, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ImageView imageView;
        AbstractC0825w abstractC0825w;
        ImageView imageView2;
        AbstractC0825w abstractC0825w2;
        ImageView imageView3;
        M5.g.f(keyEvent, "event");
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 4) {
            if (W().E(R.id.container) != null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (((AbstractC0803a) U()).f11607r.b()) {
                X2.w wVar = ((AbstractC0803a) U()).f11607r.f8196z;
                if (wVar != null) {
                    wVar.g();
                }
                return true;
            }
            return super.dispatchKeyEvent(keyEvent);
        } else if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 21) {
            if ((!W().f5925c.A().isEmpty() || ((AbstractC0803a) U()).f11607r.b()) && !d0().f7817w && ((abstractC0825w2 = this.W) == null || (imageView3 = abstractC0825w2.f11745s) == null || !imageView3.isFocused())) {
                return super.dispatchKeyEvent(keyEvent);
            }
            h0();
            f0(false);
            return true;
        } else if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 22) {
            if ((!W().f5925c.A().isEmpty() || ((AbstractC0803a) U()).f11607r.b()) && !d0().f7817w && ((abstractC0825w = this.W) == null || (imageView2 = abstractC0825w.f11745s) == null || !imageView2.isFocused())) {
                return super.dispatchKeyEvent(keyEvent);
            }
            h0();
            f0(true);
            return true;
        } else if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() != 21 && keyEvent.getKeyCode() != 22) {
            if (W().f5925c.A().isEmpty() && !((AbstractC0803a) U()).f11607r.b()) {
                AbstractC0825w abstractC0825w3 = this.W;
                if (abstractC0825w3 != null && (imageView = abstractC0825w3.f11745s) != null) {
                    imageView.requestFocus();
                }
                StyledPlayerView styledPlayerView = ((AbstractC0803a) U()).f11607r;
                styledPlayerView.g(styledPlayerView.f());
                return true;
            }
            return super.dispatchKeyEvent(keyEvent);
        } else {
            return super.dispatchKeyEvent(keyEvent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [O3.E] */
    /* JADX WARN: Type inference failed for: r0v8, types: [e2.B] */
    /* JADX WARN: Type inference failed for: r15v1, types: [e2.O, e2.P] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final void e0(EpisodeSource episodeSource, long j7) {
        String str;
        U u7;
        boolean z7;
        ?? r12;
        e2.U u8;
        boolean z8;
        Q q5;
        j0();
        StreamUrl streamUrl = d0().f7811q;
        String str2 = d0().f.a().f7990h;
        long j8 = d0().f7813s;
        M5.g.f(episodeSource, "episodeSource");
        M5.g.f(streamUrl, "url");
        M5.g.f(str2, "langCode");
        N n = new N();
        S1 s12 = new S1();
        List emptyList = Collections.emptyList();
        U u9 = U.f2621u;
        V v5 = V.f9769s;
        Uri parse = Uri.parse(streamUrl.f8070q);
        String valueOf = String.valueOf(episodeSource.f7976q);
        valueOf.getClass();
        int ordinal = streamUrl.f8071r.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                str = null;
            } else {
                str = "application/mp4";
            }
        } else {
            str = "application/x-mpegURL";
        }
        List list = episodeSource.f7981v;
        if (!list.isEmpty()) {
            List<SubtitleSource> list2 = list;
            ArrayList arrayList = new ArrayList(m.P(list2));
            for (SubtitleSource subtitleSource : list2) {
                X x7 = new X(Uri.parse(subtitleSource.f8078s));
                x7.f9780g = subtitleSource.f8078s;
                x7.f9776a = "text/vtt";
                x7.f = subtitleSource.f8079t;
                boolean z9 = !n.X(str2);
                String str3 = subtitleSource.f8080u;
                if (z9 && M5.g.a(str3, str2)) {
                    x7.f9777b = 1;
                }
                if (j8 != -1) {
                    if (subtitleSource.f8076q != j8) {
                        arrayList.add(new Y(x7));
                    }
                    x7.f9777b = 1;
                    arrayList.add(new Y(x7));
                } else {
                    if (!n.X(str2)) {
                        if (!M5.g.a(str3, str2)) {
                        }
                        x7.f9777b = 1;
                    }
                    arrayList.add(new Y(x7));
                }
            }
            u7 = E.s(arrayList);
        } else {
            u7 = u9;
        }
        if (s12.f8415a != null && ((UUID) s12.f8418e) == null) {
            z7 = false;
        } else {
            z7 = true;
        }
        AbstractC0156a.k(z7);
        if (parse != null) {
            if (((UUID) s12.f8418e) != null) {
                q5 = new Q(s12);
            } else {
                q5 = null;
            }
            String str4 = str;
            r12 = 1;
            u8 = new e2.U(parse, str4, q5, null, emptyList, null, u7, null);
        } else {
            r12 = 1;
            u8 = null;
        }
        Z z10 = new Z(valueOf, new O(n), u8, new T(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C0597b0.f9850Y, v5);
        ((C0585B) c0()).g0(r12);
        c cVar = (c) c0();
        cVar.getClass();
        U x8 = E.x(z10);
        C0585B c0585b = (C0585B) cVar;
        c0585b.q0();
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < x8.f2623t; i7++) {
            arrayList2.add(c0585b.f9425G.b((Z) x8.get(i7)));
        }
        c0585b.q0();
        c0585b.Q(c0585b.f9472w0);
        c0585b.M();
        c0585b.W += r12;
        ArrayList arrayList3 = c0585b.f9424E;
        if (!arrayList3.isEmpty()) {
            c0585b.c0(arrayList3.size());
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i8 = 0; i8 < arrayList2.size(); i8++) {
            C0617l0 c0617l0 = new C0617l0((AbstractC0000a) arrayList2.get(i8), c0585b.F);
            arrayList4.add(c0617l0);
            arrayList3.add(i8, new C0584A(c0617l0.f10012b, c0617l0.f10011a.f1170o));
        }
        c0585b.f9445b0 = c0585b.f9445b0.a(arrayList4.size());
        z0 z0Var = new z0(arrayList3, c0585b.f9445b0);
        boolean q7 = z0Var.q();
        int i9 = z0Var.f10104t;
        if (!q7 && i9 <= 0) {
            throw new IllegalStateException();
        }
        p0 X6 = c0585b.X(c0585b.f9472w0, z0Var, c0585b.Y(z0Var, 0, j7));
        int i10 = X6.f10046e;
        if (i10 != r12) {
            if (!z0Var.q() && i9 > 0) {
                i10 = 2;
            } else {
                i10 = 4;
            }
        }
        p0 g7 = X6.g(i10);
        c0585b.f9420A.f9544x.a(17, new C0587D(arrayList4, c0585b.f9445b0, 0, H.J(j7))).b();
        if (!c0585b.f9472w0.f10044b.f1180a.equals(g7.f10044b.f1180a) && !c0585b.f9472w0.f10043a.q()) {
            z8 = r12;
        } else {
            z8 = false;
        }
        c0585b.o0(g7, 0, 1, z8, 4, c0585b.N(g7), -1, false);
        ((C0585B) c0()).a0();
    }

    public final void f0(boolean z7) {
        long j7;
        TvPlayerViewModel d02 = d0();
        W5.p0 p0Var = d02.n;
        if (p0Var != null) {
            p0Var.b(null);
        }
        d02.f7817w = true;
        long j8 = d02.f7815u;
        long j9 = 10000;
        if (z7) {
            d02.f7815u = j8 + j9;
            j7 = d02.f7816v + j9;
        } else {
            d02.f7815u = j8 - j9;
            j7 = d02.f7816v - j9;
        }
        d02.f7816v = j7;
        if (d02.f7815u < 0) {
            d02.f7815u = 0L;
        }
        d02.f7806k.f(new C1104f(new C1524f(Long.valueOf(d02.f7815u), Long.valueOf(d02.f7816v))));
        d02.n = d02.d(false, new F(d02, null));
    }

    @Override // e2.t0
    public final /* synthetic */ void g(s0 s0Var) {
    }

    public final void g0(boolean z7) {
        int i7 = z7 ? 0 : 4;
        AbstractC0825w abstractC0825w = this.W;
        if (abstractC0825w == null) {
            return;
        }
        abstractC0825w.f11744r.setVisibility(i7);
        abstractC0825w.f11740A.setVisibility(i7);
        abstractC0825w.f11750x.setVisibility(i7);
        abstractC0825w.f11749w.setVisibility(i7);
        abstractC0825w.f11741B.setVisibility(i7);
        abstractC0825w.f11746t.setVisibility(i7);
        abstractC0825w.f11747u.setVisibility(i7);
        abstractC0825w.f11748v.setVisibility(i7);
        abstractC0825w.f11745s.setVisibility(i7);
    }

    @Override // e2.t0
    public final /* synthetic */ void h(C0597b0 c0597b0) {
    }

    public final void h0() {
        LinearLayout linearLayout;
        if (!d0().f7817w) {
            AbstractC0825w abstractC0825w = this.W;
            if (abstractC0825w != null) {
                linearLayout = abstractC0825w.f11751y;
            } else {
                linearLayout = null;
            }
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            c cVar = (c) c0();
            cVar.getClass();
            ((C0585B) cVar).g0(false);
            d0().f7815u = ((C0585B) c0()).M();
            InterfaceC0093a0 interfaceC0093a0 = this.f7801X;
            if (interfaceC0093a0 != null) {
                interfaceC0093a0.b(null);
            }
            g0(false);
        }
    }

    @Override // e2.t0
    public final /* synthetic */ void i(q0 q0Var) {
    }

    public final void i0() {
        TextView textView;
        int i7;
        AbstractC0825w abstractC0825w = this.W;
        if (abstractC0825w != null) {
            textView = abstractC0825w.f11746t;
        } else {
            textView = null;
        }
        if (textView != null) {
            int ordinal = d0().f7812r.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal == 4) {
                                i7 = R.string.label_quality_sd;
                            } else {
                                throw new RuntimeException();
                            }
                        } else {
                            i7 = R.string.label_quality_sdp;
                        }
                    } else {
                        i7 = R.string.label_quality_hd;
                    }
                } else {
                    i7 = R.string.label_quality_fhd;
                }
            } else {
                i7 = R.string.label_quality_auto;
            }
            textView.setText(getString(i7));
        }
    }

    @Override // e2.t0
    public final void j(C0616l c0616l) {
        int indexOf;
        M5.g.f(c0616l, "error");
        TvPlayerViewModel d02 = d0();
        long M6 = ((C0585B) c0()).M();
        EpisodeSource episodeSource = d02.f7810p;
        if (episodeSource != null && (indexOf = d02.f7808m.indexOf(d02.f7811q)) > -1 && d02.f7808m.size() - indexOf > 1) {
            d02.f7811q = (StreamUrl) d02.f7808m.get(indexOf + 1);
            d02.f7805j.f(new C1104f(new y(episodeSource, M6)));
            return;
        }
        Toast.makeText(getApplicationContext(), (int) R.string.msg_no_playable_sources, 0).show();
    }

    public final void j0() {
        String str;
        TextView textView = null;
        if (o1.h.f12853a[b0().f12880a.f8037y.ordinal()] == 1) {
            AbstractC0825w abstractC0825w = this.W;
            if (abstractC0825w != null) {
                textView = abstractC0825w.f11740A;
            }
            if (textView != null) {
                str = String.valueOf(b0().d);
            } else {
                return;
            }
        } else {
            AbstractC0825w abstractC0825w2 = this.W;
            if (abstractC0825w2 != null) {
                textView = abstractC0825w2.f11740A;
            }
            if (textView != null) {
                str = b0().f12880a.f8032t;
            } else {
                return;
            }
        }
        textView.setText(str);
    }

    @Override // w5.InterfaceC1437b
    public final Object k() {
        if (this.f7795Q == null) {
            synchronized (this.f7796R) {
                try {
                    if (this.f7795Q == null) {
                        this.f7795Q = new b((Activity) this);
                    }
                } finally {
                }
            }
        }
        return this.f7795Q.k();
    }

    @Override // e2.t0
    public final /* synthetic */ void l(boolean z7) {
    }

    @Override // e2.t0
    public final /* synthetic */ void m(L0 l02) {
    }

    @Override // e2.t0
    public final /* synthetic */ void n(int i7, int i8) {
    }

    @Override // e2.t0
    public final /* synthetic */ void o(int i7) {
    }

    @Override // q1.g, android.app.Activity
    public final void onDestroy() {
        String str;
        AudioTrack audioTrack;
        C0585B c0585b = (C0585B) c0();
        c0585b.q0();
        c0585b.f9435Q.d(1, c0585b.S());
        c0585b.l0(null);
        c0585b.f9462r0 = new M2.c(c0585b.f9472w0.f10057r, U.f2621u);
        C0585B c0585b2 = (C0585B) c0();
        c0585b2.getClass();
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(c0585b2)));
        sb.append(" [ExoPlayerLib/2.19.1] [");
        sb.append(H.f4606e);
        sb.append("] [");
        HashSet hashSet = AbstractC0592I.f9559a;
        synchronized (AbstractC0592I.class) {
            str = AbstractC0592I.f9560b;
        }
        sb.append(str);
        sb.append("]");
        AbstractC0156a.x("ExoPlayerImpl", sb.toString());
        c0585b2.q0();
        if (H.f4603a < 21 && (audioTrack = c0585b2.f9448e0) != null) {
            audioTrack.release();
            c0585b2.f9448e0 = null;
        }
        c0585b2.f9434P.j();
        c0585b2.f9436R.getClass();
        c0585b2.f9437S.getClass();
        C0598c c0598c = c0585b2.f9435Q;
        c0598c.f9911c = null;
        c0598c.a();
        if (!c0585b2.f9420A.x()) {
            c0585b2.f9421B.e(10, new C0214f(4));
        }
        c0585b2.f9421B.d();
        c0585b2.f9475y.f4597a.removeCallbacksAndMessages(null);
        InterfaceC0137f interfaceC0137f = c0585b2.f9428J;
        f fVar = c0585b2.f9426H;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((C0150t) interfaceC0137f).f4442b.f3382r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C0136e c0136e = (C0136e) it.next();
            if (c0136e.f4390b == fVar) {
                c0136e.f4391c = true;
                copyOnWriteArrayList.remove(c0136e);
            }
        }
        p0 p0Var = c0585b2.f9472w0;
        if (p0Var.f10054o) {
            c0585b2.f9472w0 = p0Var.a();
        }
        p0 g7 = c0585b2.f9472w0.g(1);
        c0585b2.f9472w0 = g7;
        p0 b7 = g7.b(g7.f10044b);
        c0585b2.f9472w0 = b7;
        b7.f10055p = b7.f10057r;
        c0585b2.f9472w0.f10056q = 0L;
        f fVar2 = c0585b2.f9426H;
        D d = fVar2.f10355x;
        AbstractC0156a.l(d);
        d.c(new E1.b(15, fVar2));
        c0585b2.f9473x.a();
        c0585b2.d0();
        Surface surface = c0585b2.f9450g0;
        if (surface != null) {
            surface.release();
            c0585b2.f9450g0 = null;
        }
        c0585b2.f9462r0 = M2.c.f2253r;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (keyEvent != null) {
            keyEvent.getAction();
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override // q1.g, android.app.Activity
    public final void onPause() {
        c cVar = (c) c0();
        cVar.getClass();
        if (((C0585B) cVar).O().p() > 0) {
            d0().h(b0().f12880a, ((C0585B) c0()).M(), ((C0585B) c0()).R());
        }
        super.onPause();
    }

    @Override // androidx.activity.l, androidx.lifecycle.InterfaceC0332j
    public final androidx.lifecycle.Y r() {
        androidx.lifecycle.Y r3 = super.r();
        i a7 = ((C0745d) ((InterfaceC1293a) android.support.v4.media.session.b.g0(InterfaceC1293a.class, this))).a();
        r3.getClass();
        return new C1298f((Set) a7.f14556r, r3, (androidx.fragment.app.D) a7.f14557s);
    }

    @Override // e2.t0
    public final /* synthetic */ void s(Z z7, int i7) {
    }

    @Override // e2.t0
    public final /* synthetic */ void u(boolean z7) {
    }

    @Override // e2.t0
    public final /* synthetic */ void v() {
    }

    @Override // e2.t0
    public final /* synthetic */ void w(C0616l c0616l) {
    }

    @Override // e2.t0
    public final /* synthetic */ void x(M2.c cVar) {
    }

    @Override // e2.t0
    public final /* synthetic */ void y(boolean z7) {
    }

    @Override // e2.t0
    public final /* synthetic */ void z(z zVar) {
    }
}
