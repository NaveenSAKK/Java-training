package com.del;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MenuController {

    private final MenuService menuService;

    @Inject
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GET
    @Path("/welcome")
    public String fnWelcome() {
        return "THIS IS THE FIRST WELCOME PROGRAM OF HOTEL MENU SERVICE";
    }

    @POST
    @Path("/addmenu")
    public Menu fnadd( Menu menu) {
        return menuService.saveMenu(menu);
    }

    @GET
    @Path("/listmenu")
    public List<Menu> getMenulist() {
        return menuService.getAllMenus();
    }

    @GET
    @Path("/find/{menuid}")
    public Menu getMenu(@PathParam("menuid") Long id)  {
        System.out.println("_________finding __"+id);
        return menuService.getMenuById(id);
    }
    @DELETE
    @Path("/delete/{menuid}")
    public Response deleteMenu(@PathParam("menuid") int id)  {
        menuService.deleteMenu(id);
        return Response.status(Response.Status.NO_CONTENT).build();
    }

//    @PUT
//    @Path("/update/{id}")
//    public Menu updateMenu(@PathParam("menuid") int id, @Valid UserDto userDto)  {
//        return menuService.updateMenu(id, userDto.toUser());
//    }
}

