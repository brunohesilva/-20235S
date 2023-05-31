describe("logar ulife", () => {
    it('acesso ulife', () => {
        cy.visit('https://www.ulife.com.br/login.aspx')
        cy.get('input[name = "ctl00$b$txtLogin"]').type("125111347384")
        cy.get('input[name = "ctl00$b$txtPassword"]').type("Meumalvado16")
        cy.get('input[name = "ctl00$b$imbLogin"]').click()
    }) 
})