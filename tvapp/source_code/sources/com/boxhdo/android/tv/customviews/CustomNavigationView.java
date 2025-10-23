package com.boxhdo.android.tv.customviews;

import M5.g;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.b;
import com.boxhdo.android.tv.R;
import com.boxhdo.android.tv.customviews.CustomNavigationView;
import com.boxhdo.android.tv.ui.hostMain.TvMainFragment;
import i1.c;
import i1.d;
import j1.o0;
/* loaded from: classes.dex */
public final class CustomNavigationView extends LinearLayout {

    /* renamed from: t */
    public static final /* synthetic */ int f7777t = 0;

    /* renamed from: q */
    public d f7778q;

    /* renamed from: r */
    public c f7779r;

    /* renamed from: s */
    public o0 f7780s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        g.f(context, "context");
        this.f7779r = c.f11324r;
        setupMenuUI(context);
        d();
    }

    public static /* synthetic */ void a(CustomNavigationView customNavigationView) {
        setupMenuExpandedUI$lambda$13(customNavigationView);
    }

    public static final void setupMenuExpandedUI$lambda$13(CustomNavigationView customNavigationView) {
        g.f(customNavigationView, "this$0");
        customNavigationView.e(true);
        customNavigationView.b(true);
        customNavigationView.c();
    }

    private final void setupMenuUI(Context context) {
        setOrientation(1);
        setGravity(17);
        Object systemService = context.getSystemService("layout_inflater");
        g.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        androidx.databinding.d b7 = b.b((LayoutInflater) systemService, R.layout.menu_layout, this, true);
        g.e(b7, "inflate(inflater, R.layo….menu_layout, this, true)");
        o0 o0Var = (o0) b7;
        this.f7780s = o0Var;
        o0Var.f11706v.setOnClickListener(new View.OnClickListener(this) { // from class: i1.b

            /* renamed from: r  reason: collision with root package name */
            public final /* synthetic */ CustomNavigationView f11322r;

            {
                this.f11322r = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomNavigationView customNavigationView = this.f11322r;
                switch (r2) {
                    case 0:
                        int i7 = CustomNavigationView.f7777t;
                        g.f(customNavigationView, "this$0");
                        c cVar = customNavigationView.f7779r;
                        c cVar2 = c.f11323q;
                        if (cVar != cVar2) {
                            d dVar = customNavigationView.f7778q;
                            if (dVar != null) {
                                ((TvMainFragment) dVar).v0(cVar2);
                            }
                            customNavigationView.f7779r = cVar2;
                            customNavigationView.c();
                            customNavigationView.d();
                            return;
                        }
                        return;
                    case 1:
                        int i8 = CustomNavigationView.f7777t;
                        g.f(customNavigationView, "this$0");
                        c cVar3 = customNavigationView.f7779r;
                        c cVar4 = c.f11324r;
                        if (cVar3 != cVar4) {
                            d dVar2 = customNavigationView.f7778q;
                            if (dVar2 != null) {
                                ((TvMainFragment) dVar2).v0(cVar4);
                            }
                            customNavigationView.f7779r = cVar4;
                            customNavigationView.c();
                            customNavigationView.d();
                            return;
                        }
                        return;
                    case 2:
                        int i9 = CustomNavigationView.f7777t;
                        g.f(customNavigationView, "this$0");
                        c cVar5 = customNavigationView.f7779r;
                        c cVar6 = c.f11325s;
                        if (cVar5 != cVar6) {
                            d dVar3 = customNavigationView.f7778q;
                            if (dVar3 != null) {
                                ((TvMainFragment) dVar3).v0(cVar6);
                            }
                            customNavigationView.f7779r = cVar6;
                            customNavigationView.c();
                            customNavigationView.d();
                            return;
                        }
                        return;
                    case 3:
                        int i10 = CustomNavigationView.f7777t;
                        g.f(customNavigationView, "this$0");
                        c cVar7 = customNavigationView.f7779r;
                        c cVar8 = c.f11326t;
                        if (cVar7 != cVar8) {
                            d dVar4 = customNavigationView.f7778q;
                            if (dVar4 != null) {
                                ((TvMainFragment) dVar4).v0(cVar8);
                            }
                            customNavigationView.f7779r = cVar8;
                            customNavigationView.c();
                            customNavigationView.d();
                            return;
                        }
                        return;
                    case 4:
                        int i11 = CustomNavigationView.f7777t;
                        g.f(customNavigationView, "this$0");
                        c cVar9 = customNavigationView.f7779r;
                        c cVar10 = c.f11327u;
                        if (cVar9 != cVar10) {
                            d dVar5 = customNavigationView.f7778q;
                            if (dVar5 != null) {
                                ((TvMainFragment) dVar5).v0(cVar10);
                            }
                            customNavigationView.f7779r = cVar10;
                            customNavigationView.c();
                            customNavigationView.d();
                            return;
                        }
                        return;
                    default:
                        int i12 = CustomNavigationView.f7777t;
                        g.f(customNavigationView, "this$0");
                        c cVar11 = customNavigationView.f7779r;
                        c cVar12 = c.f11328v;
                        if (cVar11 != cVar12) {
                            d dVar6 = customNavigationView.f7778q;
                            if (dVar6 != null) {
                                ((TvMainFragment) dVar6).v0(cVar12);
                            }
                            customNavigationView.f7779r = cVar12;
                            customNavigationView.c();
                            customNavigationView.d();
                            return;
                        }
                        return;
                }
            }
        });
        o0 o0Var2 = this.f7780s;
        if (o0Var2 != null) {
            o0Var2.f11702r.setOnClickListener(new View.OnClickListener(this) { // from class: i1.b

                /* renamed from: r  reason: collision with root package name */
                public final /* synthetic */ CustomNavigationView f11322r;

                {
                    this.f11322r = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CustomNavigationView customNavigationView = this.f11322r;
                    switch (r2) {
                        case 0:
                            int i7 = CustomNavigationView.f7777t;
                            g.f(customNavigationView, "this$0");
                            c cVar = customNavigationView.f7779r;
                            c cVar2 = c.f11323q;
                            if (cVar != cVar2) {
                                d dVar = customNavigationView.f7778q;
                                if (dVar != null) {
                                    ((TvMainFragment) dVar).v0(cVar2);
                                }
                                customNavigationView.f7779r = cVar2;
                                customNavigationView.c();
                                customNavigationView.d();
                                return;
                            }
                            return;
                        case 1:
                            int i8 = CustomNavigationView.f7777t;
                            g.f(customNavigationView, "this$0");
                            c cVar3 = customNavigationView.f7779r;
                            c cVar4 = c.f11324r;
                            if (cVar3 != cVar4) {
                                d dVar2 = customNavigationView.f7778q;
                                if (dVar2 != null) {
                                    ((TvMainFragment) dVar2).v0(cVar4);
                                }
                                customNavigationView.f7779r = cVar4;
                                customNavigationView.c();
                                customNavigationView.d();
                                return;
                            }
                            return;
                        case 2:
                            int i9 = CustomNavigationView.f7777t;
                            g.f(customNavigationView, "this$0");
                            c cVar5 = customNavigationView.f7779r;
                            c cVar6 = c.f11325s;
                            if (cVar5 != cVar6) {
                                d dVar3 = customNavigationView.f7778q;
                                if (dVar3 != null) {
                                    ((TvMainFragment) dVar3).v0(cVar6);
                                }
                                customNavigationView.f7779r = cVar6;
                                customNavigationView.c();
                                customNavigationView.d();
                                return;
                            }
                            return;
                        case 3:
                            int i10 = CustomNavigationView.f7777t;
                            g.f(customNavigationView, "this$0");
                            c cVar7 = customNavigationView.f7779r;
                            c cVar8 = c.f11326t;
                            if (cVar7 != cVar8) {
                                d dVar4 = customNavigationView.f7778q;
                                if (dVar4 != null) {
                                    ((TvMainFragment) dVar4).v0(cVar8);
                                }
                                customNavigationView.f7779r = cVar8;
                                customNavigationView.c();
                                customNavigationView.d();
                                return;
                            }
                            return;
                        case 4:
                            int i11 = CustomNavigationView.f7777t;
                            g.f(customNavigationView, "this$0");
                            c cVar9 = customNavigationView.f7779r;
                            c cVar10 = c.f11327u;
                            if (cVar9 != cVar10) {
                                d dVar5 = customNavigationView.f7778q;
                                if (dVar5 != null) {
                                    ((TvMainFragment) dVar5).v0(cVar10);
                                }
                                customNavigationView.f7779r = cVar10;
                                customNavigationView.c();
                                customNavigationView.d();
                                return;
                            }
                            return;
                        default:
                            int i12 = CustomNavigationView.f7777t;
                            g.f(customNavigationView, "this$0");
                            c cVar11 = customNavigationView.f7779r;
                            c cVar12 = c.f11328v;
                            if (cVar11 != cVar12) {
                                d dVar6 = customNavigationView.f7778q;
                                if (dVar6 != null) {
                                    ((TvMainFragment) dVar6).v0(cVar12);
                                }
                                customNavigationView.f7779r = cVar12;
                                customNavigationView.c();
                                customNavigationView.d();
                                return;
                            }
                            return;
                    }
                }
            });
            o0 o0Var3 = this.f7780s;
            if (o0Var3 != null) {
                o0Var3.f11703s.setOnClickListener(new View.OnClickListener(this) { // from class: i1.b

                    /* renamed from: r  reason: collision with root package name */
                    public final /* synthetic */ CustomNavigationView f11322r;

                    {
                        this.f11322r = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CustomNavigationView customNavigationView = this.f11322r;
                        switch (r2) {
                            case 0:
                                int i7 = CustomNavigationView.f7777t;
                                g.f(customNavigationView, "this$0");
                                c cVar = customNavigationView.f7779r;
                                c cVar2 = c.f11323q;
                                if (cVar != cVar2) {
                                    d dVar = customNavigationView.f7778q;
                                    if (dVar != null) {
                                        ((TvMainFragment) dVar).v0(cVar2);
                                    }
                                    customNavigationView.f7779r = cVar2;
                                    customNavigationView.c();
                                    customNavigationView.d();
                                    return;
                                }
                                return;
                            case 1:
                                int i8 = CustomNavigationView.f7777t;
                                g.f(customNavigationView, "this$0");
                                c cVar3 = customNavigationView.f7779r;
                                c cVar4 = c.f11324r;
                                if (cVar3 != cVar4) {
                                    d dVar2 = customNavigationView.f7778q;
                                    if (dVar2 != null) {
                                        ((TvMainFragment) dVar2).v0(cVar4);
                                    }
                                    customNavigationView.f7779r = cVar4;
                                    customNavigationView.c();
                                    customNavigationView.d();
                                    return;
                                }
                                return;
                            case 2:
                                int i9 = CustomNavigationView.f7777t;
                                g.f(customNavigationView, "this$0");
                                c cVar5 = customNavigationView.f7779r;
                                c cVar6 = c.f11325s;
                                if (cVar5 != cVar6) {
                                    d dVar3 = customNavigationView.f7778q;
                                    if (dVar3 != null) {
                                        ((TvMainFragment) dVar3).v0(cVar6);
                                    }
                                    customNavigationView.f7779r = cVar6;
                                    customNavigationView.c();
                                    customNavigationView.d();
                                    return;
                                }
                                return;
                            case 3:
                                int i10 = CustomNavigationView.f7777t;
                                g.f(customNavigationView, "this$0");
                                c cVar7 = customNavigationView.f7779r;
                                c cVar8 = c.f11326t;
                                if (cVar7 != cVar8) {
                                    d dVar4 = customNavigationView.f7778q;
                                    if (dVar4 != null) {
                                        ((TvMainFragment) dVar4).v0(cVar8);
                                    }
                                    customNavigationView.f7779r = cVar8;
                                    customNavigationView.c();
                                    customNavigationView.d();
                                    return;
                                }
                                return;
                            case 4:
                                int i11 = CustomNavigationView.f7777t;
                                g.f(customNavigationView, "this$0");
                                c cVar9 = customNavigationView.f7779r;
                                c cVar10 = c.f11327u;
                                if (cVar9 != cVar10) {
                                    d dVar5 = customNavigationView.f7778q;
                                    if (dVar5 != null) {
                                        ((TvMainFragment) dVar5).v0(cVar10);
                                    }
                                    customNavigationView.f7779r = cVar10;
                                    customNavigationView.c();
                                    customNavigationView.d();
                                    return;
                                }
                                return;
                            default:
                                int i12 = CustomNavigationView.f7777t;
                                g.f(customNavigationView, "this$0");
                                c cVar11 = customNavigationView.f7779r;
                                c cVar12 = c.f11328v;
                                if (cVar11 != cVar12) {
                                    d dVar6 = customNavigationView.f7778q;
                                    if (dVar6 != null) {
                                        ((TvMainFragment) dVar6).v0(cVar12);
                                    }
                                    customNavigationView.f7779r = cVar12;
                                    customNavigationView.c();
                                    customNavigationView.d();
                                    return;
                                }
                                return;
                        }
                    }
                });
                o0 o0Var4 = this.f7780s;
                if (o0Var4 != null) {
                    o0Var4.f11708x.setOnClickListener(new View.OnClickListener(this) { // from class: i1.b

                        /* renamed from: r  reason: collision with root package name */
                        public final /* synthetic */ CustomNavigationView f11322r;

                        {
                            this.f11322r = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            CustomNavigationView customNavigationView = this.f11322r;
                            switch (r2) {
                                case 0:
                                    int i7 = CustomNavigationView.f7777t;
                                    g.f(customNavigationView, "this$0");
                                    c cVar = customNavigationView.f7779r;
                                    c cVar2 = c.f11323q;
                                    if (cVar != cVar2) {
                                        d dVar = customNavigationView.f7778q;
                                        if (dVar != null) {
                                            ((TvMainFragment) dVar).v0(cVar2);
                                        }
                                        customNavigationView.f7779r = cVar2;
                                        customNavigationView.c();
                                        customNavigationView.d();
                                        return;
                                    }
                                    return;
                                case 1:
                                    int i8 = CustomNavigationView.f7777t;
                                    g.f(customNavigationView, "this$0");
                                    c cVar3 = customNavigationView.f7779r;
                                    c cVar4 = c.f11324r;
                                    if (cVar3 != cVar4) {
                                        d dVar2 = customNavigationView.f7778q;
                                        if (dVar2 != null) {
                                            ((TvMainFragment) dVar2).v0(cVar4);
                                        }
                                        customNavigationView.f7779r = cVar4;
                                        customNavigationView.c();
                                        customNavigationView.d();
                                        return;
                                    }
                                    return;
                                case 2:
                                    int i9 = CustomNavigationView.f7777t;
                                    g.f(customNavigationView, "this$0");
                                    c cVar5 = customNavigationView.f7779r;
                                    c cVar6 = c.f11325s;
                                    if (cVar5 != cVar6) {
                                        d dVar3 = customNavigationView.f7778q;
                                        if (dVar3 != null) {
                                            ((TvMainFragment) dVar3).v0(cVar6);
                                        }
                                        customNavigationView.f7779r = cVar6;
                                        customNavigationView.c();
                                        customNavigationView.d();
                                        return;
                                    }
                                    return;
                                case 3:
                                    int i10 = CustomNavigationView.f7777t;
                                    g.f(customNavigationView, "this$0");
                                    c cVar7 = customNavigationView.f7779r;
                                    c cVar8 = c.f11326t;
                                    if (cVar7 != cVar8) {
                                        d dVar4 = customNavigationView.f7778q;
                                        if (dVar4 != null) {
                                            ((TvMainFragment) dVar4).v0(cVar8);
                                        }
                                        customNavigationView.f7779r = cVar8;
                                        customNavigationView.c();
                                        customNavigationView.d();
                                        return;
                                    }
                                    return;
                                case 4:
                                    int i11 = CustomNavigationView.f7777t;
                                    g.f(customNavigationView, "this$0");
                                    c cVar9 = customNavigationView.f7779r;
                                    c cVar10 = c.f11327u;
                                    if (cVar9 != cVar10) {
                                        d dVar5 = customNavigationView.f7778q;
                                        if (dVar5 != null) {
                                            ((TvMainFragment) dVar5).v0(cVar10);
                                        }
                                        customNavigationView.f7779r = cVar10;
                                        customNavigationView.c();
                                        customNavigationView.d();
                                        return;
                                    }
                                    return;
                                default:
                                    int i12 = CustomNavigationView.f7777t;
                                    g.f(customNavigationView, "this$0");
                                    c cVar11 = customNavigationView.f7779r;
                                    c cVar12 = c.f11328v;
                                    if (cVar11 != cVar12) {
                                        d dVar6 = customNavigationView.f7778q;
                                        if (dVar6 != null) {
                                            ((TvMainFragment) dVar6).v0(cVar12);
                                        }
                                        customNavigationView.f7779r = cVar12;
                                        customNavigationView.c();
                                        customNavigationView.d();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    o0 o0Var5 = this.f7780s;
                    if (o0Var5 != null) {
                        o0Var5.f11704t.setOnClickListener(new View.OnClickListener(this) { // from class: i1.b

                            /* renamed from: r  reason: collision with root package name */
                            public final /* synthetic */ CustomNavigationView f11322r;

                            {
                                this.f11322r = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                CustomNavigationView customNavigationView = this.f11322r;
                                switch (r2) {
                                    case 0:
                                        int i7 = CustomNavigationView.f7777t;
                                        g.f(customNavigationView, "this$0");
                                        c cVar = customNavigationView.f7779r;
                                        c cVar2 = c.f11323q;
                                        if (cVar != cVar2) {
                                            d dVar = customNavigationView.f7778q;
                                            if (dVar != null) {
                                                ((TvMainFragment) dVar).v0(cVar2);
                                            }
                                            customNavigationView.f7779r = cVar2;
                                            customNavigationView.c();
                                            customNavigationView.d();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        int i8 = CustomNavigationView.f7777t;
                                        g.f(customNavigationView, "this$0");
                                        c cVar3 = customNavigationView.f7779r;
                                        c cVar4 = c.f11324r;
                                        if (cVar3 != cVar4) {
                                            d dVar2 = customNavigationView.f7778q;
                                            if (dVar2 != null) {
                                                ((TvMainFragment) dVar2).v0(cVar4);
                                            }
                                            customNavigationView.f7779r = cVar4;
                                            customNavigationView.c();
                                            customNavigationView.d();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        int i9 = CustomNavigationView.f7777t;
                                        g.f(customNavigationView, "this$0");
                                        c cVar5 = customNavigationView.f7779r;
                                        c cVar6 = c.f11325s;
                                        if (cVar5 != cVar6) {
                                            d dVar3 = customNavigationView.f7778q;
                                            if (dVar3 != null) {
                                                ((TvMainFragment) dVar3).v0(cVar6);
                                            }
                                            customNavigationView.f7779r = cVar6;
                                            customNavigationView.c();
                                            customNavigationView.d();
                                            return;
                                        }
                                        return;
                                    case 3:
                                        int i10 = CustomNavigationView.f7777t;
                                        g.f(customNavigationView, "this$0");
                                        c cVar7 = customNavigationView.f7779r;
                                        c cVar8 = c.f11326t;
                                        if (cVar7 != cVar8) {
                                            d dVar4 = customNavigationView.f7778q;
                                            if (dVar4 != null) {
                                                ((TvMainFragment) dVar4).v0(cVar8);
                                            }
                                            customNavigationView.f7779r = cVar8;
                                            customNavigationView.c();
                                            customNavigationView.d();
                                            return;
                                        }
                                        return;
                                    case 4:
                                        int i11 = CustomNavigationView.f7777t;
                                        g.f(customNavigationView, "this$0");
                                        c cVar9 = customNavigationView.f7779r;
                                        c cVar10 = c.f11327u;
                                        if (cVar9 != cVar10) {
                                            d dVar5 = customNavigationView.f7778q;
                                            if (dVar5 != null) {
                                                ((TvMainFragment) dVar5).v0(cVar10);
                                            }
                                            customNavigationView.f7779r = cVar10;
                                            customNavigationView.c();
                                            customNavigationView.d();
                                            return;
                                        }
                                        return;
                                    default:
                                        int i12 = CustomNavigationView.f7777t;
                                        g.f(customNavigationView, "this$0");
                                        c cVar11 = customNavigationView.f7779r;
                                        c cVar12 = c.f11328v;
                                        if (cVar11 != cVar12) {
                                            d dVar6 = customNavigationView.f7778q;
                                            if (dVar6 != null) {
                                                ((TvMainFragment) dVar6).v0(cVar12);
                                            }
                                            customNavigationView.f7779r = cVar12;
                                            customNavigationView.c();
                                            customNavigationView.d();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        o0 o0Var6 = this.f7780s;
                        if (o0Var6 != null) {
                            o0Var6.f11707w.setOnClickListener(new View.OnClickListener(this) { // from class: i1.b

                                /* renamed from: r  reason: collision with root package name */
                                public final /* synthetic */ CustomNavigationView f11322r;

                                {
                                    this.f11322r = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    CustomNavigationView customNavigationView = this.f11322r;
                                    switch (r2) {
                                        case 0:
                                            int i7 = CustomNavigationView.f7777t;
                                            g.f(customNavigationView, "this$0");
                                            c cVar = customNavigationView.f7779r;
                                            c cVar2 = c.f11323q;
                                            if (cVar != cVar2) {
                                                d dVar = customNavigationView.f7778q;
                                                if (dVar != null) {
                                                    ((TvMainFragment) dVar).v0(cVar2);
                                                }
                                                customNavigationView.f7779r = cVar2;
                                                customNavigationView.c();
                                                customNavigationView.d();
                                                return;
                                            }
                                            return;
                                        case 1:
                                            int i8 = CustomNavigationView.f7777t;
                                            g.f(customNavigationView, "this$0");
                                            c cVar3 = customNavigationView.f7779r;
                                            c cVar4 = c.f11324r;
                                            if (cVar3 != cVar4) {
                                                d dVar2 = customNavigationView.f7778q;
                                                if (dVar2 != null) {
                                                    ((TvMainFragment) dVar2).v0(cVar4);
                                                }
                                                customNavigationView.f7779r = cVar4;
                                                customNavigationView.c();
                                                customNavigationView.d();
                                                return;
                                            }
                                            return;
                                        case 2:
                                            int i9 = CustomNavigationView.f7777t;
                                            g.f(customNavigationView, "this$0");
                                            c cVar5 = customNavigationView.f7779r;
                                            c cVar6 = c.f11325s;
                                            if (cVar5 != cVar6) {
                                                d dVar3 = customNavigationView.f7778q;
                                                if (dVar3 != null) {
                                                    ((TvMainFragment) dVar3).v0(cVar6);
                                                }
                                                customNavigationView.f7779r = cVar6;
                                                customNavigationView.c();
                                                customNavigationView.d();
                                                return;
                                            }
                                            return;
                                        case 3:
                                            int i10 = CustomNavigationView.f7777t;
                                            g.f(customNavigationView, "this$0");
                                            c cVar7 = customNavigationView.f7779r;
                                            c cVar8 = c.f11326t;
                                            if (cVar7 != cVar8) {
                                                d dVar4 = customNavigationView.f7778q;
                                                if (dVar4 != null) {
                                                    ((TvMainFragment) dVar4).v0(cVar8);
                                                }
                                                customNavigationView.f7779r = cVar8;
                                                customNavigationView.c();
                                                customNavigationView.d();
                                                return;
                                            }
                                            return;
                                        case 4:
                                            int i11 = CustomNavigationView.f7777t;
                                            g.f(customNavigationView, "this$0");
                                            c cVar9 = customNavigationView.f7779r;
                                            c cVar10 = c.f11327u;
                                            if (cVar9 != cVar10) {
                                                d dVar5 = customNavigationView.f7778q;
                                                if (dVar5 != null) {
                                                    ((TvMainFragment) dVar5).v0(cVar10);
                                                }
                                                customNavigationView.f7779r = cVar10;
                                                customNavigationView.c();
                                                customNavigationView.d();
                                                return;
                                            }
                                            return;
                                        default:
                                            int i12 = CustomNavigationView.f7777t;
                                            g.f(customNavigationView, "this$0");
                                            c cVar11 = customNavigationView.f7779r;
                                            c cVar12 = c.f11328v;
                                            if (cVar11 != cVar12) {
                                                d dVar6 = customNavigationView.f7778q;
                                                if (dVar6 != null) {
                                                    ((TvMainFragment) dVar6).v0(cVar12);
                                                }
                                                customNavigationView.f7779r = cVar12;
                                                customNavigationView.c();
                                                customNavigationView.d();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            e(false);
                            b(false);
                            return;
                        }
                        g.l("binding");
                        throw null;
                    }
                    g.l("binding");
                    throw null;
                }
                g.l("binding");
                throw null;
            }
            g.l("binding");
            throw null;
        }
        g.l("binding");
        throw null;
    }

    public final void b(boolean z7) {
        o0 o0Var = this.f7780s;
        if (o0Var == null) {
            g.l("binding");
            throw null;
        }
        int childCount = o0Var.f11705u.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            o0 o0Var2 = this.f7780s;
            if (o0Var2 == null) {
                g.l("binding");
                throw null;
            }
            View childAt = o0Var2.f11705u.getChildAt(i7);
            childAt.setFocusable(z7);
            childAt.setFocusableInTouchMode(z7);
            d();
        }
    }

    public final void c() {
        CustomMenuItem customMenuItem;
        int ordinal = this.f7779r.ordinal();
        if (ordinal == 0) {
            o0 o0Var = this.f7780s;
            if (o0Var == null) {
                g.l("binding");
                throw null;
            }
            customMenuItem = o0Var.f11706v;
        } else if (ordinal == 1) {
            o0 o0Var2 = this.f7780s;
            if (o0Var2 == null) {
                g.l("binding");
                throw null;
            }
            customMenuItem = o0Var2.f11702r;
        } else if (ordinal == 2) {
            o0 o0Var3 = this.f7780s;
            if (o0Var3 == null) {
                g.l("binding");
                throw null;
            }
            customMenuItem = o0Var3.f11703s;
        } else if (ordinal == 3) {
            o0 o0Var4 = this.f7780s;
            if (o0Var4 == null) {
                g.l("binding");
                throw null;
            }
            customMenuItem = o0Var4.f11708x;
        } else if (ordinal == 4) {
            o0 o0Var5 = this.f7780s;
            if (o0Var5 == null) {
                g.l("binding");
                throw null;
            }
            customMenuItem = o0Var5.f11704t;
        } else if (ordinal != 5) {
            return;
        } else {
            o0 o0Var6 = this.f7780s;
            if (o0Var6 == null) {
                g.l("binding");
                throw null;
            }
            customMenuItem = o0Var6.f11707w;
        }
        customMenuItem.requestFocus();
    }

    public final void d() {
        CustomMenuItem customMenuItem;
        o0 o0Var = this.f7780s;
        if (o0Var != null) {
            CustomMenuItem customMenuItem2 = o0Var.f11706v;
            g.e(customMenuItem2, "viewSearch");
            customMenuItem2.setStateSelected(false);
            CustomMenuItem customMenuItem3 = o0Var.f11702r;
            g.e(customMenuItem3, "viewHome");
            customMenuItem3.setStateSelected(false);
            CustomMenuItem customMenuItem4 = o0Var.f11703s;
            g.e(customMenuItem4, "viewMovies");
            customMenuItem4.setStateSelected(false);
            CustomMenuItem customMenuItem5 = o0Var.f11708x;
            g.e(customMenuItem5, "viewTvSeries");
            customMenuItem5.setStateSelected(false);
            CustomMenuItem customMenuItem6 = o0Var.f11704t;
            g.e(customMenuItem6, "viewMyList");
            customMenuItem6.setStateSelected(false);
            CustomMenuItem customMenuItem7 = o0Var.f11707w;
            g.e(customMenuItem7, "viewSettings");
            customMenuItem7.setStateSelected(false);
            o0 o0Var2 = this.f7780s;
            if (o0Var2 != null) {
                int ordinal = this.f7779r.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                    if (ordinal == 5) {
                                        customMenuItem = o0Var2.f11707w;
                                        g.e(customMenuItem, "viewSettings");
                                    } else {
                                        return;
                                    }
                                } else {
                                    customMenuItem = o0Var2.f11704t;
                                    g.e(customMenuItem, "viewMyList");
                                }
                            } else {
                                customMenuItem = o0Var2.f11708x;
                                g.e(customMenuItem, "viewTvSeries");
                            }
                        } else {
                            customMenuItem = o0Var2.f11703s;
                            g.e(customMenuItem, "viewMovies");
                        }
                    } else {
                        customMenuItem = o0Var2.f11702r;
                        g.e(customMenuItem, "viewHome");
                    }
                } else {
                    customMenuItem = o0Var2.f11706v;
                    g.e(customMenuItem, "viewSearch");
                }
                customMenuItem.setStateSelected(true);
                return;
            }
            g.l("binding");
            throw null;
        }
        g.l("binding");
        throw null;
    }

    public final void e(boolean z7) {
        o0 o0Var = this.f7780s;
        if (o0Var == null) {
            g.l("binding");
            throw null;
        }
        o0Var.f11702r.setExpand(z7);
        o0 o0Var2 = this.f7780s;
        if (o0Var2 == null) {
            g.l("binding");
            throw null;
        }
        o0Var2.f11706v.setExpand(z7);
        o0 o0Var3 = this.f7780s;
        if (o0Var3 == null) {
            g.l("binding");
            throw null;
        }
        o0Var3.f11703s.setExpand(z7);
        o0 o0Var4 = this.f7780s;
        if (o0Var4 == null) {
            g.l("binding");
            throw null;
        }
        o0Var4.f11708x.setExpand(z7);
        o0 o0Var5 = this.f7780s;
        if (o0Var5 == null) {
            g.l("binding");
            throw null;
        }
        o0Var5.f11704t.setExpand(z7);
        o0 o0Var6 = this.f7780s;
        if (o0Var6 != null) {
            o0Var6.f11707w.setExpand(z7);
        } else {
            g.l("binding");
            throw null;
        }
    }

    public final c getCurrentSelected() {
        return this.f7779r;
    }

    public final void setMenuClickListener(d dVar) {
        g.f(dVar, "listener");
        this.f7778q = dVar;
    }

    public final void setSelected(c cVar) {
        g.f(cVar, "currentSelected");
        this.f7779r = cVar;
        d();
    }
}
